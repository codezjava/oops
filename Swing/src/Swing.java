import java.awt.event.*;
import javax.swing.*;

public class Swing {
	public static void main(String arg[]) {
		JFrame f = new JFrame();
		final JTextField tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		JButton b = new JButton("Click here");
		b.setBounds(50, 100, 95, 30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("welcome");
			}
		});
		f.add(b);
		f.add(tf);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
	}
}
