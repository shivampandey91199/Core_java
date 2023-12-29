package Loops;

import java.util.Scanner;

public class DIV_ELE_VEDIC {

	public static void ele(int num, int div) {
		String conversation = String.valueOf(num);
		int length = (num + "").length();
		int conversionArr[] = new int[length];
		int count = 0;
		while (count < length) {
			conversionArr[count] = Character.getNumericValue(conversation.charAt(count));
			count++;
		}
		int odd = 0, even = 0;
		for (int i = 0; i < conversionArr.length; i++) {
			if (i % 2 == 0) {
				even += conversionArr[i];
			} else {
				odd += conversionArr[i];
			}

			int sub = even - odd;
			if (sub == 0 || sub % 11 == 0) 
				System.out.println("yes " + num + " is divisible by" + div);
			else 
				System.out.println("no " + num + " isn't divisible by" + div);
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int div = 11;
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		DIV_ELE_VEDIC.ele(num, div);
		sc.close();

	}

}
