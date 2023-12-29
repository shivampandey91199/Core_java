package FunctionsDemo;

public class Bubble {

	public static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.println(value + " ");
		}
	}

	public static void bubbleSortAssending(int[] arr) {
		int n = arr.length;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}

	}

	public static void bubbleSortDessending(int[] arr) {
		int n = arr.length;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 64, 55, 45, 85, 75, 98 };
		System.out.println("Original array");
		printArray(arr);

		bubbleSortAssending(arr);
		System.out.println("bubble Sort array after assending array");
		printArray(arr);

		bubbleSortDessending(arr);
		System.out.println("bubble Sort array after dessending array");
		printArray(arr);

	}

}
