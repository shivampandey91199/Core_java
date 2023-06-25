/*
 * Write a Java program to insert an element into 
 * the array list at the first position. 
 */
package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment_Q49 {
  public static void main(String[] args) {
	List <String>list=new ArrayList<String>();
	list.add("shivam");
	list.add("mukul");
	list.add("vikram");
	list.add("dev");
	System.out.println(list);
	list.add(0,"anand");
	System.out.println(list);
}
}
