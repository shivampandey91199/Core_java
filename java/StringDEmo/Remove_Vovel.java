package StringDEmo;

import java.util.Scanner;

public class Remove_Vovel {

	   static String removeVovel(String str) {
		   return str.replaceAll("[aeiouAEIOU]", "");
	   }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String you want to print :");
        String str=sc.nextLine();
        System.out.println(removeVovel(str));
        sc.close();
	}

}
