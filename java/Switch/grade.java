package Switch;

import java.util.Scanner;

public class grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks : ");
		int marks = sc.nextInt();
		switch (marks / 10) {
		case 10: {
			System.out.println("A++");
			break;
		}
		case 9: {
			System.out.println("A+");
			break;
		}
		case 8: {
			System.out.println("B+");
			break;
			}
		case 7: {
			System.out.println("B");
			break;
		}
		case 6: {
			System.out.println("C++");
			break;
		}
		case 5: {
			System.out.println("Just Pass");
			break;
		}
		case 4: {
			System.out.println("fail");
			break;
		}

		default:
			System.out.println("invalid input");
		}

		sc.close();
	}

}
