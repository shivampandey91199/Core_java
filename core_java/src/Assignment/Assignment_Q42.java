/*
 *  W.A.J. P to create one thread by extending Thread class in another Class. 
 */

package Assignment;

public class Assignment_Q42 extends Thread{
	public void run() {
		System.out.println("thread is running ");
	}
	
	public static void main(String[] args) {
        Assignment_Q42 q=new Assignment_Q42();
        q.start();
	}
}
