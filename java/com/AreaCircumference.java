package com;

import java.util.Scanner;

public class AreaCircumference {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double redius, area, circumferenece;
		System.out.println("Enter redius of circle");
		redius=sc.nextDouble();
		area = Math.PI*redius*redius;
		circumferenece = 2 *Math.PI*redius;
		System.out.println("Circumference of circle is : "+circumferenece);
		System.out.println("Area of circle is : "+area);
        sc.close();
	}
	

}
