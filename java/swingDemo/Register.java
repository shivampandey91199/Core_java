package swingDemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Register implements ActionListener {

	JButton b1, b2;
	JLabel l1, l2, l3;
	JTextField t1, t2, t3;

	Register() {
		JFrame fr = new JFrame("Register");
		fr.setSize(500, 600);
		fr.setVisible(true);
		fr.setLayout(null);

		l1 = new JLabel("Name : ");
		l1.setBounds(100, 100, 120, 20);
		fr.add(l1);
		l2 = new JLabel("Email : ");
		l2.setBounds(100, 130, 120, 20);
		fr.add(l2);
		l3 = new JLabel("Password : ");
		l3.setBounds(100, 160, 120, 20);
		fr.add(l3);

		t1 = new JTextField();
		t1.setBounds(180, 100, 120, 20);
		fr.add(t1);
		t2 = new JTextField();
		t2.setBounds(180, 130, 120, 20);
		fr.add(t2);
		t3 = new JTextField();
		t3.setBounds(180, 160, 120, 20);
		fr.add(t3);

		b1 = new JButton("Reset");
		b1.setBounds(100, 300, 100, 20);
		fr.add(b1);
		b2 = new JButton("Register");
		b2.setBounds(220, 300, 100, 20);
		fr.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);

	}

	public static void main(String[] args) {
		new Register();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Model m = new Model();
		if (e.getSource() == b1) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
		} else if (e.getSource() == b2) {
			m.setName(t1.getText());
			m.setEmail(t2.getText());
			m.setPassword(t3.getText());
			;
			if (m != null) {
				try {
					Connection con = DBConnection.createConnection();
					String sql = "insert into user (name,email,password)values(?,?,?)";
					PreparedStatement pst = con.prepareStatement(sql);
					pst.setString(1, m.getName());
					pst.setString(2, m.getEmail());
					pst.setString(3, m.getPassword());
					pst.executeUpdate();
					t1.setText("");
					t2.setText("");
					t3.setText("");
					new login();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}
