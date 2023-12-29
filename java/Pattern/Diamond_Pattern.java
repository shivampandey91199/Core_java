package Pattern;

import java.util.Scanner;

public class Diamond_Pattern {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows(odd numbere) : ");
		int rows = sc.nextInt();

		if (rows % 2 == 0) {
			System.out.println("Please enter odd number for diamond pattern : ");
			sc.close();
			return;
		}

		int spaces = rows / 2;
		int stars = 1;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.println("*");
			}
			for (int j = 1; j <= stars; j++) {
				System.out.println(" ");
			}
			System.out.println();
			if (i <= rows / 2) {
				spaces++;
				stars -= 2;
			}
		}
		sc.close();
	}
}
