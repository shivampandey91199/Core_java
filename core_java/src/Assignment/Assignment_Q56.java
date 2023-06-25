/*
 * Write a Java program to shuffle elements in an array list. 
 */
package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment_Q56 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("red");
		list.add("black");
		list.add("blue");
		list.add("sky");
		list.add("purple");
		list.add("white");
		System.out.println("Before Suffle \n"+list);
		Collections.shuffle(list);
		System.out.println("Before Suffle \n"+list);
		
	}

}
