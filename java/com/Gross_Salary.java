package com;

import java.util.Scanner;

/*Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%
*/

public class Gross_Salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic Salary");
		int a = sc.nextInt();
		float hra, da;
		if (a <= 10000) {
			hra = a * 0.2f;
			da = a * 0.8f;
		} else if (a <= 20000) {
			hra = a * 0.25f;
			da = a * 0.9f;
		}else {
			hra = a * 0.3f;
			da = a * 0.95f;		
		}
		System.out.println("Gross Salary : "+(a+hra+da));
		sc.close();
	}
}
