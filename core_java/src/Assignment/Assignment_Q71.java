/*
 * Write a Java program to replace the second element of an Array List with the specified element.   
 */

package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment_Q71 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("java");
		list.add("Css");
		list.add("HTMl");
		list.add("CPP");
		list.add("Python");
	    System.out.println(list);
	    
	     String new_List="Android";
	     list.set(1, new_List);
	     int num=list.size();
	     for(int i=0;i<num;i++) {
	    	 System.out.println(list.get(i));
	     }
	    	 
	    
	
	
	}
	

}
