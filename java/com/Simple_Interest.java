package com;

import java.util.Scanner;

public class Simple_Interest {
  public static void main(String[] args) {
	// si=p*r*t/100
	  
	  double si ;
	  int p,r,t;
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the principal :");
	  p=sc.nextInt();
	  System.out.print("Enter rate of interest :");
	  r=sc.nextInt();
	  System.out.print("Enter the year : ");
	  t=sc.nextInt();
	  si=(p*r*t)/100;
	  System.out.println("your interest is : "+si);
	  sc.close();
	  
}
	
}
