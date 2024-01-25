package solution;

import java.util.Arrays;

public class CheckMinimum {

	public static int findMinimumBySort(int[] arr) {

		Arrays.sort(arr);

		return arr[0];
	}

	public static int findMinimumByBucle(int[] arr) {

		int minimum = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minimum) {
				minimum = arr[i];
			}
			return minimum;
		}

		return arr[0];
	}

	public static int findMaximum(int[] arr) {

		int maximum = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maximum) {
				maximum = arr[i];
			}
		}
		return maximum;
	}

	public static int findMinimumByIndex(int[] arr) {

		int indexMin = 0;
		int indexMax = arr.length - 1;

		while (indexMin < indexMax) {

			if (arr[indexMin] < arr[indexMax])
				indexMax--;
			else
				indexMin++;

		}

		return arr[indexMin];
	}

	public static void main(String[] args) {

		int[] arr = { 4, 5, 10, 3, 6 };

		System.out.println(findMinimumBySort(arr));
		System.out.println(findMinimumByBucle(arr));
		System.out.println(findMinimumByIndex(arr));

		System.out.println("Maximo: ");
		System.out.println(findMaximum(arr));

	}

}
