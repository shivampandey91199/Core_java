package FunctionsDemo;

import java.util.Scanner;

public class desiTOBin {
	
	public static String desimalToBinary(int desimal) {
		if(desimal == 0) {
			return "0";
		}
		StringBuilder binary = new StringBuilder();
		while(desimal > 0) {
			int rem = desimal %2;
			binary.insert(0, rem);
			desimal /=2;
		}
		return binary.toString();
	}
	
	
	
	public static void main(String[] args) {
   
	 Scanner s=new Scanner(System.in);
	 System.out.print("Enter desimal value :");
	 int desimal=s.nextInt();
	 String binary = desimalToBinary(desimal);
	 System.out.println("desimal : "+desimal);
	 System.out.println("binary  : "+binary);
	 s.close();
	}
}
