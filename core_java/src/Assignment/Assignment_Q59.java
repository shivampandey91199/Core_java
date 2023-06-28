/*
 * Write a Java program to get the number of elements in a hash set. 
 */

package Assignment;

import java.util.HashSet;
import java.util.Set;

public class Assignment_Q59 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Red");
		set.add("Green");
		set.add("yellow");
		set.add("olive");
		set.add("black");
		System.out.println("The Set is : " + set);
		System.out.println("Element in set : " + set.size());
	}
}
