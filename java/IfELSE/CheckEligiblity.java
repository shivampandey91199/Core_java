package IfELSE;

import java.util.Scanner;

public class CheckEligiblity {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age :");
		int age = sc.nextInt();
		if(age >=  18) {
			System.out.println("You are eligible for voting");
		}else {
			System.out.println("Sorry!!! \nyou are not eligible");
		}
		sc.close();
	}

}
