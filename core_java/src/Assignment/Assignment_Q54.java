/*
 *  Write a Java program to sort a given array list.  
 */
package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment_Q54 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Swift");
		list.add("Python");
		list.add("Cpp");
		list.add("DBMS");
		list.add("DotNet");
		System.out.println("Befor Sort");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("After sort");
		System.out.println(list);
	}

}
