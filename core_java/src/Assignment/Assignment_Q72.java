/*
 * Write a Java program to print all the elements of an Array List using the position of the elements
 */

package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment_Q72 {
	public static void main(String[] args) {
	   List	list=new ArrayList();
	   list.add("Red");
	   list.add("green");
	   list.add("purple");
	   list.add("black");
	   list.add("white");
	   
	   int n=list.size();
	   for(int i=0;i<n;i++) {
		   System.out.println(list.get(i));
	   }
	}

}
