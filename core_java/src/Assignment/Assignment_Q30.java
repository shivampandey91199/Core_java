/*
 *  We have to calculate the area of a rectangle, a square and a circle. 
 *  Create an abstract class 'Shape' with three abstract methods 
 *  namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea'
 *   taking one parameter each. The parameters of 'RectangleArea' 
 *  are its length and breadth, that of 'SquareArea' is its side 
 *  and that of 'CircleArea' is its radius. Now create another class 'Area' 
 *  containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' 
 *  for printing the area of rectangle, square and circle respectively. 
 *  Create an object of class 'Area' and call all the three methods
 */

package Assignment;

abstract class Shape {
	public abstract void RectangleArea(int l, int b);

	public abstract void SquareArea(int s);

	public abstract void CircleArea(int r);
}

class Area extends Shape {

	public void RectangleArea(int l, int b) {
		System.out.println("Area of Rectangle is " + (l * b));

	}

	@Override
	public void SquareArea(int s) {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle is " + (s * s));
	}

	@Override
	public void CircleArea(int r) {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle is " + (Math.PI * r * r));
	}

}

public class Assignment_Q30 {
	public static void main(String[] args) {
		Area a = new Area();
		a.CircleArea(2);
		a.SquareArea(4);
		a.RectangleArea(3, 4);
	}

}
