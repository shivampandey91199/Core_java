package com;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int a= sc.nextInt();
		System.out.println("First power " +a+" second power "+a*a+ " third power "+a*a*a);
		sc.close();
	}

}
