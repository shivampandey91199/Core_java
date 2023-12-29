package StringDEmo;

import java.util.Scanner;

public class StrifngPalindrom {

	public static boolean isPalindrome(String str) {

		str = str.replaceAll("\\s", "").toLowerCase();
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();

		if (isPalindrome(str)) {
			System.out.println(str + " is palindrome ");
		} else {
			System.out.println(str + " is not palindrome ");
		}
		sc.close();

	}

}
