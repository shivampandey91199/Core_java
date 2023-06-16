package Assignment;
/*
 * 
 * 
 * Write a program in Java to make such a pattern like right angle triangle with number increased by 1 The pattern like:  
1  
2 3  
4 5 6  
7 8 9 10  
 * 
 * 
 */
public class Assignment_Q6 {
	public static void main(String[] args) {
		int i, j,k=1;
		for(i=1;i<=4;i++) {
			for(j=1;j<i+1;j++) {
				System.out.print(k++ +" ");
			}
			System.out.println(" ");
			System.out.println(" ");
			
		}
	} 

}
