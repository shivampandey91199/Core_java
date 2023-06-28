/*
 *  Write a Java program to extract a portion of an array list.   
 */


package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment_Q62 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Shivam");
		list.add("mukul");
		list.add("Vikram");
		list.add("dev");
		list.add("anand");
        System.out.println("Before reverse");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("after reverse");
		System.out.println(list);

	}

}
