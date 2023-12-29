package StringDEmo;

import java.util.Scanner;

public class Del_subString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter original String");
		String os=sc.nextLine();
		System.out.println("Enter subStrirng");
		String ss=sc.nextLine();
		String ms=os.replace(ss, "");
		System.out.println(ms);
		
		sc.close();
	}
	
}
