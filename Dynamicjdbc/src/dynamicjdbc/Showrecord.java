package dynamicjdbc;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Showrecord implements ActionListener {
	JFrame frame1;
	JTextField textbox;
	JLabel label;
	JButton button;
	JPanel panel;
	static JTable table;

	String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	String URL = "jdbc:mysql://localhost:3306/";
	String USERNAME = "root";
	String PASSWORD = "";
	String[] columnNames = { "user_id", "name_name", "country", "email" };

	public void actionPerformed(ActionEvent ae) {
		button = (JButton) ae.getSource();
		System.out.println("Showing table data....");
		showtableData();
	}

	public void showtableData() {
		frame1 = new JFrame("show records");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLayout(new BorderLayout());
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames);
		table = new JTable();
		table.setModel(model);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setFillsViewportHeight(true);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		String user_id = "";
		String name_name = "";
		String country = "";
		String email = "";

		try {
			Class.forName(DRIVER_CLASS);
			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			String sql = "select * from User.usertable";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				user_id = rs.getString("user_id");
				name_name = rs.getString("name_name");
				country = rs.getString("country");
				email = rs.getString("email");
				model.addRow(new Object[] { user_id, name_name, country, email });

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		frame1.add(scroll);
		frame1.setVisible(true);
		frame1.setSize(400,300);
	}

	public static void main(String args[]) throws SQLException {
		Showrecord sh = new Showrecord();
		sh.showtableData();
	}
}
