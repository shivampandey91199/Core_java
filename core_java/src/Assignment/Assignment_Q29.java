

/* Write a program to print the factorial of a number by defining a method named 'Factorial'. 
 *  Factorial of any number n is represented by n! And is equal to 1*2*3*. *(n-1) *n.
 *  E.g.- 
 *  4! = 1*2*3*4 = 24  
 *  3! = 3*2*1 = 6 
    2! = 2*1 = 2 
    Also, 1! = 1 
    0! = 0 
  */



package Assignment;

import java.util.Scanner;

public class Assignment_Q29 {
	static int Factorial(int n) {
		if(n==0 || n==1) {
			return 1 ;
			}
		else {
				return n*Factorial(n-1);
			}
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value :- ");
		int a=sc.nextInt();
		int s=Factorial(a);
		System.out.println("Factorial of " +a+ " is "+s);
		sc.close();
		}

}
