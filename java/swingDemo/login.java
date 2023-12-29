package swingDemo;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class login implements ActionListener {

	  JLabel l1,l2,l3,l4,l5;
	  JButton b1,b2,b3;
	  JTextField t1,t2,t3,t4,t5;
	
	
	 login(){
		 JFrame fr = new JFrame("Register");
			fr.setSize(500, 400);
			fr.setVisible(true);
			fr.setLayout(null);
	       
			
			l1 = new JLabel("Email : ");
			l1.setBounds(100, 100, 120, 20);
			fr.add(l1);
			l2 = new JLabel("Password : ");
			l2.setBounds(100, 130, 120, 20);
			fr.add(l2);
			
			
			t1 = new JTextField();
			t1.setBounds(180, 100, 120, 20);
			fr.add(t1);
			t2 = new JTextField();
			t2.setBounds(180, 130, 120, 20);
			fr.add(t2);
			
			
			b1 = new JButton("login");
			b1.setBounds(100, 160, 100, 20);
			fr.add(b1);
			
			b1.addActionListener(this);
	 }
	  
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Model m =new Model();
		if(e.getSource()==b1) {
			String email=t1.getText();
			String password=t2.getText();
			try {
				Connection con=DBConnection.createConnection();
				String sql="select * from user where email=? and password=?";
				PreparedStatement pst=con.prepareStatement(sql);
			    pst.setString(1, email);
			    pst.setString(2,password);
			    ResultSet rs=pst.executeQuery();
			    if(rs.next()) {
			    	
			    	m.setName(String.valueOf(rs.getString("name")));
			    	m.setEmail(String.valueOf(rs.getString("email")));
			        m.setPassword(String.valueOf(rs.getString("password")));
			           
			        
		
			}
			
			
		
	
	
	
	public static void main(String[] args) {
		new login();
	}

}



//accute uttamkumar project hod