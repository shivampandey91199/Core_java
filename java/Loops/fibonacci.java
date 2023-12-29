package Loops;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		int f1 = 0, f2 = 1, i = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count");
		int count = sc.nextInt();
		System.out.print(f1 + " , " + f2);
		while (i < count) {
			int f3 = f2 + f1;
			System.out.print(" , " + f3);
			f1 = f2;
			f2 = f3;
			i++;
			}
		sc.close();
		}
	}
