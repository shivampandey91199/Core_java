/*
 * Write a Java program to convert a hash set to an array. 
 */

package Assignment;

import java.util.HashSet;
import java.util.Set;

public class Assignment_Q67 {
	public static void main(String[] args) {
      Set<String> set=new HashSet<String>();
      set.add("Red");
      set.add("Green");
      set.add("yellow");
      set.add("pink");
      System.out.println("Set Element : "+set );
      String[] new_Array=new String[set.size()];
      set.toArray(new_Array);
      
      System.out.print("Array Element : ");
      for(String e:new_Array) {
    	  System.out.print(e+" ");
      }
	}
}
