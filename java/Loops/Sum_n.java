package Loops;

import java.util.Scanner;

public class Sum_n {
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int i=0, sum=0;
	  System.out.println("Enter the number to add");
	  int n=sc.nextInt();
	  while(i<=n) {
		  sum +=i;
		  i++;
	  }
	 System.out.println(sum);
	sc.close();
	}

}
