package Switch;

import java.util.Scanner;

public class removeVovel {
	public static boolean isVovel(char c) {
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String os = sc.nextLine();
		String ms = "";
       for(int i=0;i< os.length();i++) {
    	   char cC=os.charAt(i);
    	   
    	   if(!isVovel(cC)) {
    		   ms +=cC;
    	   }
       }
	System.out.println("Modified String : "+ms);
	sc.close();
	
	
	}
}
