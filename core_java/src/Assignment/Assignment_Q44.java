/*  W.A.J.P to start the same Thread twice by calling start () method twice. 
   Test ThreadTwice1 t1=new TestThreadTwice1();  
   t1.start ();  
   t1.start (); 
 */
package Assignment;

public class Assignment_Q44 extends Thread {

	@Override
	public void run() {
          System.out.println("Running");
		}

	public static void main(String[] args) {
		Assignment_Q44 t1=new Assignment_Q44();
		t1.start();
		t1.start();
	}
}
