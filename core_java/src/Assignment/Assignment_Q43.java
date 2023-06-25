/*
 * W.A.J.P to create 2 threads and execute 
 * that threads by providing sleep time as 2000ms and check the execution. 
 */
package Assignment;

class thread extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Thread one is running");
			 try {
					thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 }
		}
}
class thread2 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
         	System.out.println("Thread two is running");
		 }
	}
	
}
public class Assignment_Q43 {

	public static void main(String[] args) {
    thread t1=new thread();
    thread2 t2=new thread2();
    t1.start();
    t2.start();
    }
}
