package IfELSE;

import java.util.Scanner;

public class Gretest_Three_Number {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		a = sc.nextInt();
		System.out.print("Enter the second number : ");
		b = sc.nextInt();
		System.out.print("Enter the third number : ");
		c = sc.nextInt();
		if (a > b) {
			if (a > c) {
				System.out.println(a + " is gretest");
			} else {
				System.out.println(c + " is gretest");
			}
		} else if (c > b) {
			System.out.println(c + " is gretest");
		} else {
			System.out.println(b + " is gretest");
		}
		sc.close();
	}
}
