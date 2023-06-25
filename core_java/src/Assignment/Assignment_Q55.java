/*
 *  Write a Java program to copy one array list into another.   
 */
package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment_Q55 {
	public static void main(String[] args) {
     List<String> list1=new ArrayList<String>();
     list1.add("red");
     list1.add("Pink");
     list1.add("black");
     List<String> list2=new ArrayList<String>();
     list2.add("purple");
     list2.add("white");
     list2.add("blue");
     System.out.println("Before Copy");
     System.out.println(list1);
     System.out.println(list2);
     Collections.copy(list2, list1);

     System.out.println("After Copy");
     System.out.println(list1);
     System.out.println(list2);
	
	}
}
