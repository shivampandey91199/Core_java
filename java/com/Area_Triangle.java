package com;

import java.util.Scanner;

public class Area_Triangle {
	public static void main(String[] args) {
   
	  int h , b;
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter height : ");
	  h=sc.nextInt();
	  System.out.print("Enter base : ");
	  b=sc.nextInt();
	  double area = (h*b)/2;
	  System.out.println("Area of Triangle : "+area);
	  sc.close();
	}
}
