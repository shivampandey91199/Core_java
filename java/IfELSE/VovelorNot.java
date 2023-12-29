package IfELSE;

import java.util.Scanner;

public class VovelorNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the alphabat");
		char c=sc.next().charAt(0);
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o': 
		case 'u':
		System.out.println(c+" is vovel");
		break;
		default:
		 System.out.println(c+ " is constant");
		}
		sc.close();
	}

}
