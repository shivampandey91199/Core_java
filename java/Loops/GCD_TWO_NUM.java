package Loops;

import java.util.Scanner;

public class GCD_TWO_NUM {
	public static void main(String[] args) {
		int gcd = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();

		for (int i = 1; i <= a && i <= b; i++) {

			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}

		}

		System.out.printf("GCD Of %d and %d is :%d", a, b, gcd);
		sc.close();
	}
}
