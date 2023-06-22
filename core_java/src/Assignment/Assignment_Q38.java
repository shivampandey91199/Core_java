/*
 *  W.A.J.P to create the validate method that takes integer value as a parameter. 
 *  If the age is less than 18, then throw an Arithmetic Exception otherwise print
 *  a message welcome to vote.  
 *  O/P- Enter your age: 16 
 *  Exception in thread main java. Lang. Arithmetic Exception: not valid  */

package Assignment;

import java.util.Scanner;

public class Assignment_Q38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:- ");
        int i=sc.nextInt();
        if(i<18) {
        	  throw new ArithmeticException("not valid");
        }else {
        	System.out.println("Welcome to vote");
        }
		sc.close();
	}
}
