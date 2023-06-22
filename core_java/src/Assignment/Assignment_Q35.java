/*
 *  W.A.J. P to demonstrate multiple catch blocks, 
 *  (one is to handle divide by zero exception and 
 *  another one is to handle  ArrayIndexOutOfBoundException)  
 *   int a [] =new int [5]; a [5]=30/0; 
 */
package Assignment;

public class Assignment_Q35 {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Arithmatic Exception is occurs");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index out of bounds Exception is occurs ");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
