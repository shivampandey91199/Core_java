package Loops;

import java.util.Scanner;

public class Denomination {
	public static void main(String[] args) {
		int amt, r2000 = 0, r500 = 0, r200 = 0, r100 = 0, r50 = 0, r20 = 0, r10 = 0, r5 = 0, r2 = 0, r1 = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the amount in Rupees : ");
		amt = sc.nextInt();

		while (amt >= 2000) {
			r2000 = amt / 2000;
			amt = amt % 2000;
			System.out.println("\nTotal number of 2000 Rupees notes : " + r2000);
			break;
		}
		while (amt >= 500) {
			r500 = amt / 500;
			amt = amt % 500;
			System.out.println("\nTotal number of 500 Rupees notes : " + r500);
			break;
		}
		while (amt >= 200) {
			r200 = amt / 200;
			amt = amt % 200;
			System.out.println("\nTotal number of 200 Rupees notes : " + r200);
			break;
		}
		while (amt >= 100) {
			r100 = amt / 100;
			amt = amt % 100;
			System.out.println("\nTotal number of 100 Rupees notes : " + r100);
			break;
		}
		while (amt >= 50) {
			r50 = amt / 50;
			amt = amt % 50;
			System.out.println("\nTotal number of 50 Rupees notes : " + r50);
			break;
		}
		while (amt >= 20) {
			r20 = amt / 20;
			amt = amt % 20;
			System.out.println("\nTotal number of 20 Rupees notes : " + r20);
			break;
		}
		while (amt >= 10) {
			r10 = amt / 10;
			amt = amt % 10;
			System.out.println("\nTotal number of 10 Rupees notes : " + r10);
			break;
		}
		while (amt >= 5) {
			r5 = amt / 5;
			amt = amt % 5;
			System.out.println("\nTotal number of 5 Rupees notes : " + r5);

			break;
		}
		while (amt >= 2) {
			r2 = amt / 2;
			amt = amt % 2;
			System.out.println("\nTotal number of 2 Rupees notes : " + r2);
			break;
		}
		while (amt >= 1) {
			r1 = amt / 1;
			amt = amt % 1;
			System.out.println("\nTotal number of 1 Rupees notes : " + r1);
			break;
		}

		int count = r2000 + r500 + r200 + r100 + r50 + r20 + r10 + r5 + r2 + r1;
		System.out.println("Total number of Notes require : " + count);
		sc.close();
	}

}
