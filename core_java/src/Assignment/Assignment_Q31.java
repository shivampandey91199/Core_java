/*
     Write a program which will ask the user to enter his/her marks (out of 100).
     Define a method that will display grades according to the marks entered as below:  
     Marks Grade  
     91-100  AA   
     81-90   AB 
     71-80   BB 
     61-70   BC 
     51-60   CD 
     41-50   DD
     40   Fail    */


package Assignment;
import java.util.Scanner;
public class Assignment_Q31 {
	public static int mark(int i) {
		
		 
		  if(i>=91 && i<=100) {
			  System.out.println("AA");
		  }else if(i>=81 && i<=90) {
			  System.out.println("AB");
		  }
		  else if(i>=71 && i<=80) {
			  System.out.println("BB");
		  }else if(i>=61 && i<=70) {
			  System.out.println("BC");
		  }else if(i>=51 && i<=60) {
			  System.out.println("CD");
		  }else if(i>=41 && i<=50) {
			  System.out.println("DD");
		  }else if( i<=40) {
			  System.out.println("Fail");
		  }else {
			  System.out.println("invalide input");
		  }
		return i;
		   
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the marks");
		  int  k=sc.nextInt();
		 @SuppressWarnings("unused")
		int m=mark(k);
		 
		  sc.close();
	}

}
