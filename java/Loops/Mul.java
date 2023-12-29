package Loops;

import java.util.Scanner;

public class Mul {
	public static void main(String[] args) {

		int num, i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		num = sc.nextInt();
		for (i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
		sc.close();
	}
}
