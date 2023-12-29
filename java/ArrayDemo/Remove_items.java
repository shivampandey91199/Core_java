package ArrayDemo;

import java.util.Arrays;

public class Remove_items {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] Arr = new int[arr.length - 1];
		int j = 3;
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i != j) {
				Arr[k] = arr[i];
				k++;
			}
		}
		System.out.println("Before Declaration : " + Arrays.toString(arr));
		System.out.println("after Declaration : " + Arrays.toString(Arr));

	}

}
