/*
 *  Create a class named 'Rectangle' with two data members 'length' and 'breadth' 
 *  and two methods to print the area and perimeter of the rectangle respectively.
 *   Its constructor having parameters for length and 
 *  breadth is used to initialize the length and breadth of the rectangle. 
 *  Let class 'Square' inherit the 'Rectangle' class 
 *  with its constructor having a parameter for its side (suppose s)
 *   calling the constructor of its parent class as 'super (s, s)'. 
 *  Print the area and perimeter of a rectangle and a square.
 */

package Assignment;

class Rectangle {
	int length, breadth;

	public Rectangle(int l, int b) {
		length = l;
		breadth = b;
	}

	void area() {
		System.out.println(length * breadth);
	}

	void perimeter() {
		System.out.println(2 * (length + breadth));
	}
}

class square extends Rectangle {
	public square(int s) {
		super(s, s);
	}
}

public class Assignment_Q23 {
	public static void main(String[] args) {
       Rectangle r = new Rectangle(4,5);
       square    s = new square(4);
       r.area();
       r.perimeter();
       s.area();
       s.perimeter();
	 }
}
