package FunctionsDemo;

import java.util.Scanner;

public class octaToDesimal {

	public static int octaTODesi(String octa) {

		int desimal = 0;
		int length = octa.length();
		for (int i = 0; i < length; i++) {
			int digit = Character.getNumericValue(octa.charAt(length - 1 - i));
			desimal += digit * Math.pow(8, i);
		}
		return desimal;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter octal value :  ");
		String octa = sc.next();
		int desimal = octaTODesi(octa);
		System.out.println("\n\n\n\n\n octa : " + octa);
		System.out.println("desimal :" + desimal);
		sc.close();
	}
}
