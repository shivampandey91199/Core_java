package FunctionsDemo;

import java.util.Scanner;

public class binToDesi {

	public static int binaryToDesimal(String bin) {
		int desimal = 0;
		int binaryLength = bin.length();
		for (int i = binaryLength - 1; i >= 0; i--) {
			if (bin.charAt(i) == '1') {
				desimal += Math.pow(2, binaryLength - 1 - i);
			}
		}
		return desimal;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Binary values : ");
		String bin = sc.next();
        int desimal = binaryToDesimal(bin);

        
         System.out.println("Binary :"+bin);
         System.out.println("Desimal:"+desimal);
         sc.close();
	}
}
