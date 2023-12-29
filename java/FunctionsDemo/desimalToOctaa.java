package FunctionsDemo;

import java.util.Scanner;

public class desimalToOctaa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter desimal value : ");
		int desimal = sc.nextInt();
		String octalNumber = Integer.toString(desimal);
		System.out.println("octal equivalent : " + octalNumber);
        sc.close();
	}

}
