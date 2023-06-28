/*
 * Write a Java program to compare two sets and retain elements which are same on both sets
 */
package Assignment;

import java.util.HashSet;
import java.util.Set;

public class Assignment_Q73 {
 public static void main(String[] args) {
	Set<String> set=new HashSet<String>();
	set.add("java");
	set.add("android");
	set.add("python");
	set.add("php");
	System.out.println("First set Contain : "+set);
	Set<String> set1=new HashSet<String>();
	set1.add("html");
	set1.add("php");
	set1.add("css");
	set1.add("python");
	System.out.println("Second Set contain : "+set1);
	set.retainAll(set1);
	System.out.println("Final HashSet "+set);
	
}
}
