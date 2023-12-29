package StringDEmo;

import java.util.Scanner;

public class CharCount {
	public static void countChar(String str) {
		int vovel = 0;
		int constant = 0;
		int digit = 0;
		int speces = 0;

		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				if ("aeiou".contains(String.valueOf(ch))) {
					;
					vovel++;
				} else {
					constant++;
				}
			} else if (Character.isDigit(ch)) {
				digit++;

			} else if (Character.isWhitespace(ch)) {
				speces++;
			}
		}
		System.out.println("Vovels   : " + vovel);
		System.out.println("Constant : " + constant);
		System.out.println("Digit    : " + digit);
		System.out.println("Spaces   : " + speces);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		countChar(str);
		sc.close();

	}

}
