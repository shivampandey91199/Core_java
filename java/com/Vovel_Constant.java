
package com;

import java.util.Scanner;

class Char {
	void vovelORNot(char ch) {
		if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
				|| ch == 'u' || ch == 'U') {
			System.out.println(ch + " is Vovel");
		} else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is constant");
		} else {
			System.out.println("Not an alphabat");
		}
	}
}

public class Vovel_Constant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alphabat");
		char c = sc.next().charAt(0);
		Char a = new Char();
		a.vovelORNot(c);
		sc.close();

	}

}
