/*
 *  W.A.J.P to concatenate a given string to the end of another string. 
 */
package Assignment;

import java.util.Scanner;

public class Assignment_Q14 {
   public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the first String:-");
	   String str=sc.nextLine();
	   System.out.print("Enter the Second String:-"); 
       String str1=sc.nextLine();
       System.out.println("this is concatnate of str and str1");
       System.out.println(str.concat(str1));
   sc.close();
   
   }
}
