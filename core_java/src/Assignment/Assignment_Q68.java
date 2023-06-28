/*
 * Write a Java program to convert a hash set to a List/Array List. 
 */

package Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment_Q68 {
	public static void main(String[] args) {
     
		Set<String> set=new HashSet<String>();
		set.add("red");
		set.add("blue");
		set.add("sky");
		set.add("violet");
		set.add("purple");
		set.add("black");
		set.add("white");
		// original set
		System.out.println(set);
		
		
		//convert into List 
		List list=new ArrayList(set);
		
		// printing Array List
		System.out.println(list);
	  
	
	
	}
}
