// Assignment 1 Write a Java program to Take three numbers from the user and print the greatest number
package Assignment;

import java.util.Scanner;

public class Assignment_Q1 {
	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		  
	    
	    System.out.println("Enter the first value ");
	    int i=sc.nextInt();
	    System.out.println("Enter the second value");
	    int j=sc.nextInt();
	    System.out.println("Enter the third value");
	    int k=sc.nextInt();
	    if(i>j) {
	    	if(i>k) {
	    		System.out.println(i+ " is gretest ");
	    	}else {
	    		System.out.println(k+ " is gretest");
	    	}
	    }else if(j>k) {
	    	System.out.println(j+" is gretest");
	    	}else {
	    		System.out.println(k+ " is gretest");
	    	}
	    sc.close();
  	}

}
