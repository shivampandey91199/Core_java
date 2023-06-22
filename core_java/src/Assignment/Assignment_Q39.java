/*
  W.A.J.P to create a custom exception if Customer withdraw amount 
  which is greater than account balance then program will 
  show custom exception otherwise amount will deduct from account balance. 
  Account balance is: 2000 Enter withdraw amount: 2500  
  Sorry, insufficient balance, you need more 500 Rs. To perform this transaction */

package Assignment;

import java.util.Scanner;

class MinimumAccoutBalance extends Exception {
	String message;

	public MinimumAccoutBalance(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return message;
	}

}

public class Assignment_Q39 {
	public static void main(String[] args) throws MinimumAccoutBalance {
		int b = 2000;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Withdraw amount :-");						
		int a = sc.nextInt();
		int c = a - b;
		sc.close();
		if (a > b) {
			throw new MinimumAccoutBalance(
					"sorry, insufficient balance,you need more " + c + " Rs. to perform this transaction");
		} else {
			System.out.println("Transaction complate");
		}

		sc.close();
	}
}
