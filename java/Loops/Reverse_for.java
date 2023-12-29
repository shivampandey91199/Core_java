package Loops;

import java.util.Scanner;

public class Reverse_for {
	public static void main(String[] args) {
		int rem, rev=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
        int a=sc.nextInt();
      while(a!=0) {
          rem=a%10;
          rev=rev*10+rem;
          a=a/10;	
     }
		System.out.println(rev);
		sc.close();
	}

}
