package Loops;

import java.util.Scanner;

public class Reverse_forLOOp {
	public static void main(String[] args) {
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		for (; num != 0; num = num / 10) {
			int rem = num % 10;
			rev = rev * 10 + rem;
		}
		System.out.printf(" reverse is %d", rev);
		sc.close();
	}

}
