package StringDEmo;

import java.util.Scanner;

public class str_cmp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String one : ");
		String s1 = sc.next();
		System.out.println("Enter Strifng second");
		String s2 = sc.next();
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s2));
		sc.close();

	}
}
