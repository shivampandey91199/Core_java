/*
 *   Write a program in Java to display the pattern like right angle triangle with a number.   
         1  
         12  
         123  
         1234  
         12345  
 */

package Assignment;

import java.util.Scanner;

public class Assignment_Q5 {
      public static void main(String[] args) {
	 int i,j,num;
	 Scanner sc=new  Scanner(System.in);
			 System.out.println("Enter the number to be print"); 
	 int row=sc.nextInt();
	 for(i=0;i<=row;i++) {
		 num = 1;
		 for(j=0;j<i;j++) {
			 System.out.print(num+" ");
			 num++;
			 
		 }System.out.println(" ");
	 }
	}
}
