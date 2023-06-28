/*
 *  Write a Java program to get a collection view of the values contained in this map. 
 */
package Assignment;

import java.util.HashMap;
import java.util.Map;

public class Assignment_Q74 {
	public static void main(String[] args) {
  
	 Map m=new HashMap();
	 m.put(1, "red");
	 m.put(2, "blue");
	 m.put(3, "sky");
	 m.put(4, "purple");
	 m.put(5,"Black");
	 System.out.println("Collection view : " +m.values());
	
	}
}
