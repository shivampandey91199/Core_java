package com;

import java.util.Scanner;

public class Abbreviated_name {
	public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      System.out.print("Enter First name : ");
	  char fname=sc.nextLine().charAt(0);
	  System.out.print("Enter Middle name : ");
	  char mname=sc.nextLine().charAt(0);
	  System.out.print("Enter Last name : ");
	  String lname=sc.nextLine();
	  System.out.println("\n Abbreviated name:\t"+fname+"."+mname+"."+lname);
	  sc.close();
	
	
	}

}
