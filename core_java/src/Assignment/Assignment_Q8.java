



package Assignment;

import java.util.Scanner;

//  Write a Java program to count the letters, spaces, numbers and other characters of an input string




public class Assignment_Q8 {
    public static void main(String[] args) {
    	int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String for count letters, spaces, numbers");
		String name=sc.nextLine();
		// String n=name.toLowerCase();
		 //System.out.println(name);
		for(int i=1;i<name.length();i++) {
			if(name != " ") {
				count = count+1;
				
			}
		}
		System.out.println("Count of letter,spaces and number are "+count);
		sc.close();
	}
	
}
