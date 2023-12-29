package Loops;

import java.util.Scanner;

public class Count_digit {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digits");
		int num = sc.nextInt();
        while(num !=0) {
        	sum +=num%10;
        	num = num / 10;
        }
        System.out.println("sum of digit "+sum);
		sc.close();
	}
}
