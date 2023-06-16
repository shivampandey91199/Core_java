/*
 *  W.A.J.P to check whether a given string ends with the contents of another string.
 *   "Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True 
 */
package Assignment;

public class Assignment_Q16 {
public static void main(String[] args) {
	String str=  "Java Exercises" ;
	String str1="java Exercise";
	System.out.println(str.endsWith("se"));
	System.out.println(str1.endsWith("se"));
}
}
