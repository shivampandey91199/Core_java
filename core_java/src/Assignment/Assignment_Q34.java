
/* Take two numbers from the user and perform the division operation and handle Arithmetic Exception.
 *  O/P- Enter two numbers: 10 0  
 * Exception in thread main java.lang.ArithmeticException:/ by zero*/

package Assignment;

import java.util.Scanner;

public class Assignment_Q34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int i=sc.nextInt();
        System.out.println("Enter the Second Number");
        int j=sc.nextInt();
        try {
        	 System.out.println(i/j);
        }catch(Exception e) {
        	System.out.println(e);
        }
        sc.close();
	}
}
