

/*  Write a program to print the area and perimeter 
 *  of a triangle having sides of 3, 4 and 5 units by creating 
 *  a class named 'Triangle' without any parameter in its constructor
 */
package Assignment;

 class Triangle{
	 int a,b,c;
	  public double getPerimeter() {
		 return (a+b+c)/2;
		  
	 }
	 public double getArea() {
		 
		 double p=(a+b+c)/2;
		  
		 return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	 }
 }



public class Assignment_Q24 {
	public static void main(String[] args) {
     Triangle t=new Triangle();
     t.a=3;
     t.b=4;
     t.c=5;
     System.out.println("Area of Triangle is :- " +t.getArea());
     System.out.println("Perimeter of Triangle is :- "+t.getPerimeter());
	}
}
