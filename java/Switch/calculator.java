package Switch;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("For Addition press 1 : ");
		System.out.println("For Substraction press 2 : ");
		System.out.println("For Multiplication press 3 : ");
		System.out.println("For Division press 4 : ");
		int op = sc.nextInt();
		switch (op) {
		case 1: {
			System.out.println("Enter first value : ");
			int first = sc.nextInt();
			System.out.println("Enter second value : ");
			int second = sc.nextInt();
			int sum = first + second;
			System.out.println(sum);
			break;
		}
		case 2: {
			System.out.println("Enter first value : ");
			int first = sc.nextInt();
			System.out.println("Enter second value : ");
			int second = sc.nextInt();
			int sub = first - second;
			System.out.println(sub);
			break;
		}
		case 3: {
			System.out.println("Enter first value : ");
			int first = sc.nextInt();
			System.out.println("Enter second value : ");
			int second = sc.nextInt();
			int mul = first * second;
			System.out.println(mul);
			break;

		}
		case 4: {
			System.out.println("Enter first value : ");
			int first = sc.nextInt();
			System.out.println("Enter second value : ");
			int second = sc.nextInt();
			int div = first / second;
			System.out.println(div);
			break;
		}

		default:
			System.out.println("invelid input");
		}
		sc.close();
	}

}
