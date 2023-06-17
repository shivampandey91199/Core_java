/*
 *   Create a class to print the area of a square and a rectangle. 
 *   The class has two methods with the same name but different number of parameters.
 *   The method for printing area of a rectangle has two parameters which are length 
 *   and breadth respectively while the other method for printing area of square has one 
 *   parameter which is side of square*/

package Assignment;

class Print_Area{
	public int area(int l , int b) {
		int c=l*b;
		System.out.println("Area of rectangle is :- "+c);
		
		return c;
		}
   public int area(int l){
	   int c=l*l;
	   System.out.println("Area of square is :- "+c);
	   return c;
   }
}
public class Assignment_Q20 {
	public static void main(String[] args) {
		Print_Area pa=new Print_Area();
		pa.area(3, 2);
		pa.area(5);

	}
}
