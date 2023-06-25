/*W.A.J. P to create one thread by implementing Runnable interface in  Class. 
 * */
package Assignment;

public class Assignment_Q41 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread has ended");
	}

	public static void main(String[] args) {
		Assignment_Q41 q = new Assignment_Q41();
		Thread t1 = new Thread(q);
		t1.start();
		System.out.println("hi");
	}

}
