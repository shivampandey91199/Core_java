package ArrayDemo;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
        sc.close();
        int temp , rev=0,rem;
        temp=num;
        while(temp !=0) {
        	rem=temp%10;
        	rev=rev*10+rem;
        	temp /=10;
        	}
		if(num == temp) {
			System.out.println("number is palindrome");
		}else {
			System.out.println("number is not palindrome");
					
		}
	}
}
