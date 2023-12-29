package ArrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class Insert_element {

	public static int[] addElement(int n, int arr[], int ele, int pos) {

		int newArr[] = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			if (i < pos - 1) {
				newArr[i] = arr[i];
			} else if (i == pos - 1) {
				newArr[i] = ele;
			} else {
				newArr[i] = arr[i - 1];
			}
		}
		return newArr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element :");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter the elements of array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element yo want to insert");
		int ele = sc.nextInt();

		System.out.println("Enter the position where you want to insert ");
		int pos = sc.nextInt();

		arr = addElement(n, arr, ele, pos);
		System.out
				.println("\n Array with " + ele + " inserted at this position " + pos + " :\n" + Arrays.toString(arr));

		sc.close();

	}

}
