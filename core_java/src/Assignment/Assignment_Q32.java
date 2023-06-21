/*
 *  Create a class named 'Shape' with a method to print "This is this is shape".   
 *  Then create two other classes named 'Rectangle', 
 *  'Circle' inheriting the Shape class, both having a method to print 
 *  "This is rectangular shape" and "This is circular shape" 
 *  respectively. Create a subclass 'Square' of 'Rectangle' 
 *  having a method to print "Square is a rectangle". Now call the 
 *  method of 'Shape' and 'Rectangle' class by the object of 'Square' class. 
 */

package Assignment;

class shape1{
	public void Print() {
		System.out.println("This is this is shape");
	}
}
class rectangle1 extends shape1{
	public void Print1() {
		System.out.println("This is rectangular shape");
	}
}
class circle extends shape1{
	public void Print2() {
		System.out.println("This is this circular shape");
	}
}
class Square1 extends rectangle1{
	public void Print3() {
		System.out.println("square is Rectangle");
	}
}


public class Assignment_Q32 {
	public static void main(String[] args) {
    Square1 s=new Square1();
    s.Print();
    s.Print1();
	}
}
