
/*
 * W.A.J. P to demonstrate try catch block, take two numbers from the user by Command line argument 
 * and perform the division operation and handle Arithmetic  
 * O/P-  Exception in thread main java. Lang. Arithmetic Exception:/ by zero  
 */

package Assignment;

import java.util.Scanner;

public class Assignment_Q37 {
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the first number:- ");
  	  int a=sc.nextInt();
  	  System.out.print("Enter the second number :- ");
  	  int b=sc.nextInt();
  	  try {
  		   int d=a/b;
  		   System.out.println(d);
  	  }catch(Exception e) {
  		  System.out.println(e);
  	  }
	
	
	  sc.close();
	}
}
