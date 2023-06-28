/*
 * Write a Java program to iterate through all elements in a hash list. 
 */

package Assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment_Q58 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Red");
		set.add("Green");
		set.add("yellow");
		set.add("olive");
		set.add("black");
		System.out.println("The Set is : " + set);
       Iterator itr=set.iterator();
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
       }
	}

}
