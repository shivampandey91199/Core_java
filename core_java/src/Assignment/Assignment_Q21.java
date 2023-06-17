
/* Create a class with a method that prints "This is a parent class" and 
*  its subclass with another method that prints "This is child class". 
*  Now, create an object for each of the class and call 1 - 
*  method of parent class by object of parent class 2 - method of child class by 
*  object of child class 3 - method of parent class by object of child class */

package Assignment;

class parentClass {
	public void run() {
		System.out.println("This is parent class");
	}
}

class childClass extends parentClass {
	public void runn() {
		System.out.println("This is child class");
	}
}

public class Assignment_Q21 {
	public static void main(String[] args) {

		parentClass pc = new parentClass();
		// 1 - method of parent class by object of parent
		pc.run();
		childClass c = new childClass();
		// 2 - method of child class by object of child class
		c.runn();
		// 3 - method of parent class by object of child class
		c.run();

	}
}
