/*
 *  Write a Java program to check whether a map contains key-value mappings (empty) or not. 
 */

package Assignment;

import java.util.HashMap;
import java.util.Map;

public class Assignment_Q69 {
	public static void main(String[] args) {
  
	  Map map=new HashMap();
	  map.put(1, "java");
	  map.put(2, "CPP");
	  map.put( 3, "c");
	  map.put(4, "python");
	  boolean result=map.isEmpty();
	  System.out.println("Is HashMap is Empty : "+result);
	  map.clear();
	  result=map.isEmpty();
	  System.out.println("Is HashMap is Empty : "+result);
	}
}
