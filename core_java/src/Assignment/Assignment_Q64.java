/*
 *  Write a Java program to compare two array lists.
 */

package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment_Q64 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
        list.add("red");
        list.add("Black");
        list.add("green");
        List<String> list2=new ArrayList<String>();
        list2.add("red");
        list2.add("Black");
        list2.add("green");
        boolean c=list.equals(list2);
        System.out.println(c);
        list2.add("pink");
        boolean b=list.equals(list2);
        System.out.println(b);
	
	
	}

}
