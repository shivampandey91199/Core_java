
/*
 * W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch block. 
 * try {
 *  try 
 *  {//code}  
 *  catch (Exception e) 
 *  {//code}  
 *  catch (Exception e) 
 *  {//code}  
 */

package Assignment;

public class Assignment_Q36 {
	public static void main(String[] args) {
            
	  try {
		  int a[]=new int[5];
		 // a[5]=30/0;  
		 try {
		     System.out.println(a[6]);	 
		  }catch(Exception e) {
			  System.out.println(e);
		  }
	  }catch(Exception e) {
		  System.out.println(e);
	  }
	
	}
}
