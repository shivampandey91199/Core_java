package com;

import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
		int i, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is " + fact);
		sc.close();
	}
}
