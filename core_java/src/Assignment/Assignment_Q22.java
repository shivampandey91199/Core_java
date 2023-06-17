
/*
 *  Create a class named 'Member' having the following members:  
 *  1. Data members 
 *  2. Name 
 *  3. Age
 *  4. Phone number  
 *  5. Address  
 *  6. Salary  
 *  It also has a method named 'printSalary' which prints the salary of the members. 
 */
package Assignment;
 class Member{
	 int Data_member;
	 String Name;
	 int age;
	 int Phone_Number;
	 String Address;
	 int Salary;
	 public void printSalary(int Salary) {
		 System.out.println("Salary of the members are:- " +Salary);
	 }
	 
 }



public class Assignment_Q22 {
  public static void main(String[] args) {
	Member m=new Member();
	m.printSalary(1000);
}
}
