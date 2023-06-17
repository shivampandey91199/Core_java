/*Create a class named 'Print Number' to print various numbers of different 
 * data types by creating different methods with the same name 'printn'
 *  having a parameter for each data type.  */
package Assignment;


 class Print_Number{
	 public int printn(int a){
	        System.out.println(a);
	        return a;
	    }
	 public float printn(float b) {
		 System.out.println(b);
		 return b;
	 }
	 public double printn(double d) {
		 System.out.println(d);
		 return d;
	 }
	 public String printn(String c) {
		 System.out.println(c);
		 return c;
	 }
}
public class Assignment_Q19 {
	public static void main(String[] args) {
        Print_Number pn=new Print_Number();
        pn.printn(25);
        pn.printn(32.5);
        pn.printn(3.666666555855555554);
        pn.printn("Shivam");
        
  
       
	}
}
