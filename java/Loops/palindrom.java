package Loops;

import java.util.Scanner;

public class palindrom {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number");
	    int num=sc.nextInt();
	    int rem,temp,sum=0;
	    temp=num;
	    while(num>0) {
	    	rem=num%10;
	    	sum=(sum*10)+rem;
	    	num=num/10;
	      }
	  if(sum == temp) {
		  System.out.println("Number is pelindrom");
	  }else {
		  System.out.println("Number isn't pelindrom");
	  }
	sc.close();
	
	}

}
