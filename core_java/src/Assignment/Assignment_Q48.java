/*
 * Write a Java program to iterate
 * through all elements in an array list. 
 */
package Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assignment_Q48 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add("ArrayList");
		list.add('c');
        list.add(16646644);
        list.add("List");
        Iterator itr=list.iterator();
        {
        	while(itr.hasNext()) {
        		System.out.println(itr.next());
        	}
        }
	
	
	}
}
