package StringDEmo;

import java.util.Scanner;

public class Rev_string {

	public static String reverseString(String str) {
		StringBuilder reverse = new StringBuilder(str);
		return reverse.reverse().toString();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.next();
		String str1 = reverseString(str);
		System.out.println(str1);
		sc.close();
	}
}
