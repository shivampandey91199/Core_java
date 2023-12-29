package Switch;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to convert temp celsius to fahrenheit");
		System.out.println("Enter 2 to convert temp fahrenheit to celsius");
		int i = sc.nextInt();
		switch (i) {
		case 1: {
			System.out.print("Enter celsius : ");
			int c = sc.nextInt();
			double f = 33.8 * c;
			System.out.println(f);
			break;
		}
		case 2: {
			System.out.print("Enter fahrenheit : ");
			double f = sc.nextInt();
			double c = f / 33.8;
			System.out.println(c);
		break;
		}
		default:
			System.out.println("Invalid input");
		}
		sc.close();

	}

}
