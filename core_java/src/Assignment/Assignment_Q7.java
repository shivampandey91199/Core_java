package Assignment;

import java.util.Scanner;

/*
 * Write a Java program that reads a positive integer and count the number of digits the number. 
 *  Input an integer number less than ten billion: 125463 
 *   Number of digits in the number: 6 */

public class Assignment_Q7 {
 public static void main(String[] args) {
 
	  int count=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num=sc.nextInt();
	  while(num !=0) {
		  num/=10;
		  ++count;
	  }
	  System.out.println("The number of count :- " +count);
	  
	  
	  sc.close();
}
}
