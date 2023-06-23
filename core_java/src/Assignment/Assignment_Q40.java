/*
 *  W.A.J.P to create a class Student with attributes roll no, name, age and course.
 *  Initialize values through parameterized constructor. If age of student is not in between 
 *  15 and 21 then generate user defined exception "AgeNotWithinRangeException". 
 *  If name contains numbers or special symbols
 *  raise exception "NameNotValidException". Define the two exception classes. 
 */

package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class AgeNotWithInRange extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		return("Agr is not between 15 and 21....Please ReEnter the age");
	}
}
class NameNotValidException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String validName() {
		return("Name is not valid....Please ReEnter the name");
	}
}

class Student {
	int roll_no;
	String name;
	int age;
	String course;

	Student() {
		roll_no = 0;
		name = null;
		age = 0;
		course = null;
	}

	Student(int r, String n, int a, String c) {
		roll_no = r;
		name = n;
		age = a;
		course = c;
		int temp = 0;

		for (int i = 0; i < n.length(); i++) {
			char ch = n.charAt(i);
			if (ch < 'A' || ch > 'Z' && ch < 'a' || ch < 'z') {
				temp = 1;
			}
			// name
			try {
				if (temp != 1) {
					throw new NameNotValidException();
				} else {
					name = n;
				}
			} catch (NameNotValidException e2) {
				System.out.println(e2);
			}
			// age
			try {
				if (a >= 15 && a <= 21) {
					age = a;
				} else {
					throw new  AgeNotWithInRange ();
				}
			} catch ( AgeNotWithInRange  e1) {
				System.out.println(e1);
			}
		}

	}

	// Display
	void Display() {
		System.out.println("roll_n0 :- " + roll_no);
		System.out.println("name :-" + name);
		System.out.println("age :-" + age);
		System.out.println("course :- " + course);
	}
}

public class Assignment_Q40 {
	public static void main(String[] args)throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   int r,a;
	   String n,c;
	   System.out.println("Enter Roll_no,Name,Age,course");
	   r=Integer.parseInt(br.readLine());
	   n=br.readLine();
	   a=Integer.parseInt(br.readLine());
	   c=br.readLine();
	   Student s=new Student(r,n,a,c);
	   s.Display();
			
	   
	   
	}
}
