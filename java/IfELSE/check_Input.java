package IfELSE;

import java.util.Scanner;

public class check_Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the char : ");
        char c=sc.next().charAt(0);
        int n=c;
        if(c>=65 && c<=90) {
        	System.out.println("UpperCase");
        }else if(c>=97 && c<=122) {
        	System.out.println("Lowercase");
        }else if(c>=48 && c<=57) {
        	System.out.println("Digit");
        }else {
        	System.out.println("Special char");
        }
        System.out.println("ASCII value : "+n);
        sc.close();
	}	

}
