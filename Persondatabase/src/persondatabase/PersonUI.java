package persondatabase;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.text.JTextComponent;
import javax.swing.*;

public class PersonUI extends JPanel {
	private JTextField idField = new JTextField(10);
	private JTextField fNameField = new JTextField(30);
	private JTextField mNameField = new JTextField(30);
	private JTextField lNameField = new JTextField(30);
	private JTextField emailField = new JTextField(30);
	private JTextField phoneField = new JTextField(30);

	private JButton createButton = new JButton("New....");
	private JButton updateButton = new JButton("New....");
	private JButton deleteButton = new JButton("New....");
	private JButton firstButton = new JButton("New....");
	private JButton prevButton = new JButton("New....");
	private JButton nexteButton = new JButton("New....");
	private JButton lastButton = new JButton("New....");

	private PersonBean bean = new PersonBean();

	public PersonUI() {
		setBorder(new TitledBorder(new EtchedBorder(), "Person Details"));

		setLayout(new BorderLayout(5, 5));
		add(initFields(),BorderLayout.NORTH);
		add(initButtons(), BorderLayout.CENTER);
		setFieldData(bean.moveFirst());
	}

	private JPanel intitButtons() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 3, 3));
		panel.add(createButton);
		createButton.addActionListener(new ButtonHandler());

		panel.add(lastButton);
		lastButton.addActionListener(new ButtonHandler());
		return panel;
	}

	private JPanel initFields() {
		JPanel panel = new JPanel();
		panel.setLayout(new MigLayout());
		panel.add(new JLabel("ID"), "align label");
		panel.add(idField, "wrap");
		idField.setEnabled(false);
		panel.add(new JLabel("First Name"), "align label");
		panel.add(fNameField, "wrap");

		// ...
		panel.add(new JLabel("phone"), "align label");
		panel.add(phoneField, "wrap");
		return panel;
	}

	private Person getFieldData() {
		Person p = new Person();
		p.setpersonId(Integer.parseInt(idField.getText()));
		p.setfirstName(fNameField.getText());

		p.setmiddleName(mNameField.getText());
		p.setlastName(lNameField.getText());
		p.setemail(emailField.getText());
		p.setphone(phoneField.getText());
		return p;
	}

	private void setFieldData(Person p) {
		idField.setText(String.valueOf(p.getpersonId()));
		fNameField.setText(p.getfirstName());
		mNameField.setText(p.getmiddleName());
		lNameField.setText(p.getlastName());
		emailField.setText(p.getemail());
		phoneField.setText(p.getphone());
	}

	private boolean isEmptyFieldData() {
		return (fNameField.getText().trim().isEmpty() && mNameField.getText().trim().isEmpty()
				&& lNameField.getText().trim().isEmpty() && emailField.getText().trim().isEmpty()
				&& phoneField.getText().trim().isEmpty());
	}

	private class ButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Person p = getFieldData();
			switch (e.getActionCommand()) {
			case "Save":
				if (isEmptyFieldData()) {
					JOptionPane.showMessageDialog(null, "Cannot create an empty record");
					return;
				}
				if (bean.create(p) != null)
					JOptionPane.showMessageDialog(null, "New person created successfully.");
				createButton.setText("new...");
				break;
			case "New...":
				p.setpersonId(new Random().nextInt(Integer.MAX_VALUE) + 1);
				p.setfirstName("");
				p.setmiddleName("");
				p.setlastName("");
				p.setemail("");
				p.setphone("");
				setFieldData(p);
				createButton.setText("Save");
				break;
			case "updata":
				if (isEmptyFieldData()) {
					JOptionPane.showMessageDialog(null, "Cannot updata an empty recoed");
					return;
				}
				if (bean.update(p) != null)
					JOptionPane.showMessageDialog(null,
							"Person with ID:" + String.valueOf(p.getpersonId() + "is updated successfully"));
				break;
			case "Delete":
				if (isEmptyFieldData()) {
					JOptionPane.showMessageDialog(null, "Cannot delect an empty record");
					return;
				}
				p = bean.getCurrent();
				bean.delete();
				JOptionPane.showMessageDialog(null,
						"Person with ID:" + String.valueOf(p.getpersonId() + "is deleted successfully"));
				break;
			case "First":
				setFieldData(bean.moveFirst());
				break;
			case "Previous":
				setFieldData(bean.movePrevious());
				break;
			case "Next":
				setFieldData(bean.moveNext());
				break;
			case "Last":
				setFieldData(bean.moveLast());
				break;
			default:
				JOptionPane.showMessageDialog(null, "invalid command");

			}

		}
	}

}
