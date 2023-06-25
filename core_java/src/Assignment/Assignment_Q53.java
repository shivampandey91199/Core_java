/*
 * Write a Java program to search an element in an array list.   
 */
package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment_Q53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("Swift");
		list.add("Python");
		list.add("Cpp");
		list.add("DBMS");
		list.add("dotNet");
		System.out.println("Enter the element to be Search");
		String a = sc.nextLine();
		if (list.contains(a)) {
			System.out.println("found the Element ");
		} else {
			System.out.println("not found");
		}
		sc.close();

	}

}
