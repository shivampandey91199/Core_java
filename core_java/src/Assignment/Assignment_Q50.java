/*
 *  Write a Java program to retrieve an element 
 *  (at a specified index) from a given array list
 */

package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment_Q50 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Shivam");
		list.add("Dev");
		list.add("mukul");
		list.add("vikrm");
		list.add("Ram");
		System.out.println(list.get(4));
	}
}
