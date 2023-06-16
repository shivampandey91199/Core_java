// assignment 5:- Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop.

package Assignment;

import java.util.Scanner;

public class Assignment_Q4 {
  	public static void main(String[] args) {
		int sum=0,num=0,i;
		double avg;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the 5 numbers");
		for(i=0;i<5;i++) {
		  
			 num=sc.nextInt();
			sum +=num;
		}
		avg = sum/5;
		System.out.println("Sum of the value is "+sum+" and avg is "+avg);
		sc.close();
	}
}
