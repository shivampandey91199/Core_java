package ArrayDemo;

import java.util.Arrays;

public class duplicat_element {

	public static int removeDuplicateItems(int a[], int n) {

		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}
		temp[j++] = a[n - 1];
		for (int i = 0; i < j; i++) {
			a[i] = temp[i];
		}
		return j;

	}

	public static void main(String[] args) {
		int a[] = { 1, 1, 2, 3, 3, 4, 4, 5 };
		int n = a.length;
		System.out.println(Arrays.toString(a));
		n = removeDuplicateItems(a, n);
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
