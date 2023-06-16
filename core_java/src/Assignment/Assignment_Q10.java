
//  Write a Java program that accepts an integer (n) and computes the value
//of n+nn+nnn. Input number: 5  5 + 55 + 555 
package Assignment;

import java.util.Scanner;

public class Assignment_Q10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number:- ");
		int n = sc.nextInt();
		System.out.printf("%d + %d%d + %d%d%d\n", n, n, n, n, n, n);
        sc.close();
	}
}
