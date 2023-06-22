
/*  W.A.J.P to find the second most frequent character in a given string.
 *   The given string is: successes 
 *   The second most frequent char in the string is: c  */
package Assignment;

public class Assignment_Q18 {
	static int no_of_char = 256;

	static char second_most_freq(String str1) {
		int[] ctr = new int[no_of_char];
		for (int i = 0; i < str1.length(); i++) {
			(ctr[str1.charAt(i)])++;
		}
		int ctr_first = 0, ctr_second = 0;
		for(int i=0;i<no_of_char;i++) {
			if(ctr[i]>ctr[ctr_first]) {
				ctr_second=ctr_first;
				ctr_first=i;
				}else if(ctr[i]>ctr[ctr_second] && ctr[i] !=ctr[ctr_first]) {
					ctr_second=i;
				}
			
}
		return (char) ctr_second;
	}

	public static void main(String[] args) {
		String str1 = "successes";
		System.out.println("The given String is :- " + str1);
		char c=second_most_freq(str1);
     if(c != '\0') {
    	 System.out.println("The second most frequent char is : "+c);
    	 }else {
    		 System.out.println("No second frequent char in this string");
    	 }
	}
}

