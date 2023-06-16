/*  assginment 2:-Write a Java program that takes the user to provide a single character from the
	  alphabet. Print Vowel or Consonant, depending on the user input. If the user input
	  is not a letter (between a and z or A and Z), or is a string of length > 1, print an error
	  message.*/ 
package Assignment;
import java.util.Scanner;	


class Char{
		void findVovelOrnot(char ch) {
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
				System.out.println(ch+ " is vovel");
			}else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				System.out.println(ch +" is consonant");
			}else {
				System.out.println("Not an alphabat");
			}
		}
	}
public class Assignment_Q2 {
  public static void main(String[] args) {
	  Char c=new Char();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the character:- ");
	  char in=sc.next().charAt(0);
	  c.findVovelOrnot(in);	
	  sc.close();
}
}
