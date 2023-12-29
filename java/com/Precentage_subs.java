package com;

import java.util.Scanner;

public class Precentage_subs {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of maths");
		int maths = sc.nextInt();
		System.out.println("Enter the marks of English");
		int english = sc.nextInt();
		System.out.println("Enter the marks of Science");
		int science = sc.nextInt();
		System.out.println("Enter the marks of Hindi");
		int hindi = sc.nextInt();
		System.out.println("Enter the marks of Gujarati");
        int gujrati=sc.nextInt();
        int total = maths + english +science + hindi + gujrati;
        double percentage= (total*100)/500;
        System.out.println("Total marks is " +total+ " and percentage is : "+percentage);
        sc.close();
	}

}
