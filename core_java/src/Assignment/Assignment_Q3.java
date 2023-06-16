// assignment 3 Write a Java program that takes a year from user and print whether that year is a leap year or not
package Assignment;

import java.util.Scanner;

public class Assignment_Q3 {
     public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the year");
    	int i=sc.nextInt();
    	if(i % 400 ==0) {
    		System.out.println(i+ " is Leap year");
    	}else if(i % 4 == 0 && i % 100 !=0) {
    		System.out.println(i+ " is Leap year");
    	}else {
    		System.out.println(i+ " is not Leap year");
    	}
      	sc.close();
	}
}
