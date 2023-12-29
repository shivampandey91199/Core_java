package Loops;

import java.util.Scanner;

public class Generic_Root {

	public static void main(String[] args) {
		int sum, rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = sc.nextInt();
		while (num >= 10) {
			for (sum = 0; num > 0; num = num / 10) {
				rem = num % 10;
				sum = sum + rem;
			}
			if (sum >= 10) {
				num = sum;
			} else {
				System.out.println("\n The Generic root of given number is : " + sum);
			}
		}

	}
}
