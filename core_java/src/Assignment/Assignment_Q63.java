
/*
 *  Write a Java program to extract a portion of an array list.   
 * */
package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment_Q63 {
	public static void main(String[] args) {
     List<String> list=new ArrayList<String>();
     list.add("red");
     list.add("Blue");
     list.add("pink");
     list.add("purple");
     list.add("Black");
     System.out.println("Original String :" +list);
     List<String> Sub_String=list.subList(0, 4);
     System.out.println("Extrect Portion of String : "+Sub_String);;
	}
}
