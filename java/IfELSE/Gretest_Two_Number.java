package IfELSE;

import java.util.Scanner;

public class Gretest_Two_Number {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.println(num1 + " is gretest");
		} else if (num2 > num1) {
			System.out.println(num2 + " is gretest");
		} else {
			System.out.println(num1 + " and " + num2 + " is equal");
		}
		sc.close();
	}
}
