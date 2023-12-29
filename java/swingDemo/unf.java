package swingDemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class unf implements ActionListener {
  
	  
	   JLabel l1;
	   JButton b1;
	 unf(){
		 JFrame fr=new JFrame("Data not found");
		    fr.setSize(400, 350);
			fr.setVisible(true);
			fr.setLayout(null);
			
			l1 = new JLabel("Incorrect input");
			l1.setBounds(100, 100, 120, 20);
			fr.add(l1);
			b1 = new JButton("ok");
			b1.setBounds(100, 180, 100, 20);
			fr.add(b1);
			b1.addActionListener(this);
	       
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
	   if(e.getSource()==b1) {
		   new login();
	   }
		
	}
	public static void main(String[] args) {
		new unf();
	}
}
