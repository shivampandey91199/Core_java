/*
 * Write a Java program to create a new array list, 
 * add some colors (string) and print out the collection.
 */

package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment_Q46 {
	public static void main(String[] args) {
  
	List<String> list=new ArrayList<String>();
	list.add("Red");
	list.add("Blue");
	list.add("purple");
	list.add("black");
    
	// print the collection
	for(String a:list) {
		System.out.println(a);
	}
	
	
	}
}
