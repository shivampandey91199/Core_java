
/* Create an abstract class 'Bank' with an abstract method 'getBalance'. 
 * $100, $150 and $200 are deposited in banks A, B and C respectively.
 *  'BankA', 'BankB' and 'BankC'are subclasses of class 'Bank', each 
 *  having a method named 'getBalance'. Call this method by creating an
 *   object of each of the three classes.*/

package Assignment;

abstract class Bank {
	public abstract void getBalance();
}

class BankA extends Bank {
	public void getBalance() {
		System.out.println("$100 Deosited");
	}
}

class BankB extends Bank {
	public void getBalance() {
		System.out.println("$200 Deosited");

	}
}

class BankC extends Bank {
	public void getBalance() {
		System.out.println("$300 Deosited");

	}
}

public class Assignment_Q27 {
	public static void main(String[] args) {
		BankA a=new BankA();
		BankB b=new BankB();
		BankC c=new BankC();
	     a.getBalance();
	     b.getBalance();
	     c.getBalance();
	}
}
