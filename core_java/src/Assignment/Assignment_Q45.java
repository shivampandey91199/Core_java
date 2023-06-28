/*
 * W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set Daemon
 *  () method of Thread class and check whether the thread is 
 * set daemon or not by using is Daemon () method.  
 * TestDaemonThread2 t1=new TestDaemonThread2(); 
 *  TestDaemonThread2 t2=new TestDaemonThread2(); t1.start();  
 * t1.setDaemon(true);//will throw exception here t2.start(); 
 */

package Assignment;

public class Assignment_Q45 extends Thread {

	public void run() {
		System.out.println("Name :" + Thread.currentThread().getName());
		System.out.println("Name :" + Thread.currentThread().isDaemon());
	}

	public static void main(String[] args) {
		Assignment_Q45 t1 = new Assignment_Q45();
		Assignment_Q45 t2 = new Assignment_Q45();
		t1.start();
		try {t1.setDaemon(true);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		t2.start();
	}
}
