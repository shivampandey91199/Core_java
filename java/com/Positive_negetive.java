package com;

import java.util.Scanner;

public class Positive_negetive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int a = sc.nextInt();
		if (a > 0) {
			System.out.println("Number is Positive");
		} else if (a < 0) {
			System.out.println("Number is Negetive");
		} else {
			System.out.println("Number is zero");
		}
		sc.close();
	}
}
