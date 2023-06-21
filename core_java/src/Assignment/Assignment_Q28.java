/*
 *We have to calculate the percentage of marks obtained in three subjects
 * (each out of 100) by student A and in four subjects (each out of 100) by 
 * student B. Create an abstract class 'Marks' with an abstract method 
 * 'getPercentage'. It is inherited by two other classes 'A' and 'B' each 
 * having a method with the same name which returns the percentage of the 
 * students. The constructor of student A takes the marks in three subjects 
 * as its parameters and the marks in four subjects as its parameters for
 *  student B. Create an object for each of the two classes and print the 
   percentage of marks for both the students */
package Assignment;

 abstract class mark{
	 public abstract float getPercentage();
 }
 class Student_A extends mark{
	 private float mark1,mark2,mark3;
	 
	 public Student_A(float m1,float m2,float m3) {
		 mark1=m1;
		 mark2=m2;
		 mark3=m3;
	 }
	  
	 public float getPercentage() {
		 return ((mark1+mark2+mark3)/300)*100;
	 }
 }
 class Student_B extends mark{
	 private float mark1,mark2,mark3,mark4;
	 public Student_B(float m1,float m2,float m3,float m4){
		 mark1=m1;
		 mark2=m2;
		 mark3=m3;
		 mark4=m4;
		 
	 }
	 public float getPercentage() {
		 return ((mark1+mark2+mark3+mark4)/400)*100;
	 }
 }
public class Assignment_Q28 {

	public static void main(String[] args) {
		Student_A a=new Student_A(80,85,90);
		Student_B b=new Student_B(70,80,85,90);
		System.out.println("Percentage of Student A is " +a.getPercentage());
		System.out.println("Percentage of Student B is " +b.getPercentage());

	}

}
