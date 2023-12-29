package swingDemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class swing implements ActionListener {

	JButton b1, b2;

	swing() {
		JFrame fr = new JFrame("Index Page");
		fr.setVisible(true);
		fr.setSize(400, 300);
		fr.setLayout(null);

		b1 = new JButton("Register");
		b1.setBounds(100, 100, 100, 20);
		fr.add(b1);

		b2 = new JButton("Login");
		b2.setBounds(250, 100, 100, 20);
		fr.add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			new Register();
		} else if (e.getSource() == b2) {
			new login();
		}

	}

	public static void main(String[] args) {
		new swing();
	}

}
