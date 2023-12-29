package core;

public class swap {

	public static void main(String[] args) {
		int a =5;
		int b=7;
		System.out.println("before swap : " +a+ " , "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swap :" +a+ " , "+b);
	}
}
