/*
 *  Write a Java program to remove the third element from an array list. 
 */
package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment_Q52 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("Swift");
		list.add("Python");
		list.add( "Cpp");
		list.add( "DBMS");
		list.add( "dotNet");
		System.out.println(list);
		list.remove(2);
		System.out.println(list); 
	}

}
