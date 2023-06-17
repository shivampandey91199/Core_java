
/*
 * Create an abstract class 'Parent' with a method 'message'. 
 * It has two subclasses each having a method with the same name 
 * 'message' that prints "This is first subclass" and "This is second 
 * subclass" respectively. Call the methods 'message' by creating
 * an object for each subclass.  */

package Assignment;

abstract class Parent {
	public abstract void message();
}

class child extends Parent {
	public void message() {
		System.out.println("This is first subclass");
	}
}

class child1 extends Parent {
	public void message() {
		System.out.println("this is second subclass");
	}
}

public class Assignment_Q26 {
	public static void main(String[] args) {
     child c=new child();
     child1 c1=new child1();
     c.message();
     c1.message();
	}
}
