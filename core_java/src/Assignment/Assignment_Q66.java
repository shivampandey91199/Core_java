/*
 * Write a Java program to join two array list.
 */

package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment_Q66 {

	public static void main(String[] args) {
		List a = new ArrayList();
		a.add("java");
		a.add("Python");
		a.add("CPP");
		a.add("c");
		System.out.println(a);
		List b = new ArrayList();
		b.add("HTML");
		b.add("css");
		b.add("java Script");
		b.add("Bootstrap");
		System.out.println(b);

		List c = new ArrayList();
		c.addAll(a);
		c.addAll(b);
		System.out.println(c);

	}

}
