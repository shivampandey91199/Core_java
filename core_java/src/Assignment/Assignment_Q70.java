/*
 *  Write a Java program to increase the size of an array list. 
 */

package Assignment;

import java.util.ArrayList;

public class Assignment_Q70 {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(3);
		list.add("green");
		list.add("red");
		list.add("blue");
		list.add("pink");
		list.add("violet");
		list.add("Green");
		list.add("Blue");
		System.out.println(list);
		list.ensureCapacity(6);
        list.add("purple");
        list.add("Black");
        list.add("white");
        System.out.println(list);
	}
}
