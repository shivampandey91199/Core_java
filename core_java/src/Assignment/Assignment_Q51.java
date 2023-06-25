/*
 *  Write a Java program to update specific array element by given element
 */
package Assignment;

import java.util.*;

public class Assignment_Q51 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("Swift");
		list.add("Python");
		System.out.println(list);
		list.set(1, "Cpp");
		list.set(0, "DBMS");
		list.set(2, "dotNet");
		System.out.println(list);

	}
}
