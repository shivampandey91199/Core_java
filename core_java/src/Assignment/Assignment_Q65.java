/*
 * Write a Java program of swap two elements in an array list. 
 */


package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment_Q65 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Red");
		list.add("Pink");
		list.add("purple");
		list.add("yellow");
		list.add("blue");
		list.add("black");
		list.add("sky");
		System.out.println("Before swap");
		System.out.println(list);
		System.out.println("After swap");
		Collections.swap(list, 2,5);
		System.out.println(list);
	}

}
