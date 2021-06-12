package studentdatabase;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Displaystudentdata extends JFrame implements ActionListener  {
	JFrame frame1;
	JLabel l0, l1, l2;
	JComboBox c1;
	JButton b1;
	Connection con;
	ResultSet rs, rs1;
	Statement st, st1;
	PreparedStatement pst;

	String ids;
	static JTable table;
	String[] columnNames = { "studentid", "studentname", "dept", "year", "city" };
	String from;

	Displaystudentdata() {
		l0 = new JLabel("Fatching Student information");
		l0.setForeground(Color.BLUE);
		l0.setFont(new Font("Serif", Font.BOLD, 20));
		l1 = new JLabel("Select name");
		b1 = new JButton("submit");

		l0.setBounds(100, 50, 350, 40);
		l1.setBounds(75, 110, 75, 20);
		b1.setBounds(150, 150, 150, 20);
		b1.addActionListener(this);

		setTitle("Fetching Student info From database");
		setLayout(null);
		setVisible(true);
		setSize(500,500);

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		add(l0);
		add(l1);;
		add(b1);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
			st = con.createStatement();
			rs = st.executeQuery("select studentname from Student.studenttable");
			Vector v = new Vector();
			
			while (rs.next()) {
				ids = rs.getString(1);
				v.add(ids);
			}
			c1 = new JComboBox(v);
			c1.setBounds(150, 110, 150, 20);

			add(c1);
			st.close();
			rs.close();
		} catch (Exception e) {
		}
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == b1) {
			showTableData();
		}
	}

	public void showTableData() {
		frame1 = new JFrame("Databse search Result");

		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLayout(new BorderLayout());

		// TableModel tm = new TableModel();
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames);

		// DefaultTableModel model = new DefaultTableModel(tm.getData1(),tm.getColumnNames());
		// table = new JTable(model);
		table = new JTable();
		table.setModel(model);

		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setFillsViewportHeight(true);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		from = (String) c1.getSelectedItem();
		// String textvalue = textbox.getText();
		String studentid = "";
		String studentname = "";
		String dept = "";
		String year = "";
		String city = "";

		try {
			pst = con.prepareStatement("select * from Student.studenttable where studentname='" + from + "'");
			ResultSet rs = pst.executeQuery();
			int i = 0;
			if (rs.next()) {
				studentid = rs.getString("studentid");
				studentname = rs.getString("studentname");
				dept = rs.getString("dept");
				year = rs.getString("year");
				city = rs.getString("city");
				model.addRow(new Object[] { studentid, studentname, dept, year, city });
				i++;
			}
			if (i < 1) {
				JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
			}
			if (i == 1) {
				System.out.println(i + "record found");
			} else {
				System.out.println(i + "Record found");
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
		frame1.add(scroll);
		frame1.setVisible(true);
		frame1.setSize(400, 300);
	}

	public static void main(String args[])throws SQLException{
		new Displaystudentdata();
	}
}