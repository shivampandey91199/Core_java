package StringDEmo;

import java.util.Scanner;

public class LowerToUpper_visaversa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 for upper case to lower case");
		System.out.println("press 2 for lower case to upper case");
		int num = sc.nextInt();
		switch (num) {
		case 1: {
			System.out.println("Enter String");
			String str = sc.next();
			System.out.println(str.toLowerCase());
			break;
		}
		case 2: {
			System.out.println("Enter String");
			String str1 = sc.next();
			System.out.println(str1.toUpperCase());
			break;
		}
		}
		sc.close();

	}
}
