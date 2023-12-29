package swingDemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class delete implements ActionListener {

	JLabel l1;
	JButton b1, b2;

	delete() {
		JFrame fr = new JFrame("Delete");
		fr.setVisible(true);
		fr.setSize(400, 300);
		fr.setLayout(null);

		l1 = new JLabel("pakkka na bhai");
		l1.setBounds(100, 100, 120, 20);
		fr.add(l1);

		b1 = new JButton("ok");
		b1.setBounds(100, 150, 100, 20);
		fr.add(b1);

		b2 = new JButton("cansal");
		b2.setBounds(220, 150, 100, 20);
		fr.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
     if(e.getSource()==b1) {
    	   
        	 // String email= 
  
//    	 try {
//				Connection con=DBConnection.createConnection();
//				String sql="delete * from user where email=? ";
//				PreparedStatement pst=con.prepareStatement(sql);
//    	 
//    	 
//    	 }catch (Exception e1) {
//			e1.printStackTrace();
//		}     	 
     }else if(e.getSource()==b2) {
    	 new home();
     }
		
		
		
	}

	public static void main(String[] args) {
		new delete();
	}

}
