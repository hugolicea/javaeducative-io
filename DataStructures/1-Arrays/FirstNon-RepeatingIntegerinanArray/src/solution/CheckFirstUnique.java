package solution;

import java.util.HashMap;
import java.util.Map;

public class CheckFirstUnique {

	public static int findFirstUniqueIndex(int[] arr, int flag) {
		int indexMin = 0;
		int indexMax = arr.length - 1;

		while (indexMin < indexMax) {

			if (arr[indexMin] == arr[indexMax]) {
				indexMin++;
				indexMax--;
			} else
				indexMax--;
		}

		return arr[indexMin];
	}

	public static int findFirstUniqueBucle(int[] arr) {
		// Inside Inner Loop Check Each index of outerLoop If it's repeated in array
		// If it's not repeated then return this as first unique Integer
		boolean isRepeated = false;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j] && i != j) {
					isRepeated = true;
					break;
				}
			} // end of InnerLoop

			if (isRepeated == false) {
				return arr[i];
			} else {
				isRepeated = false;
			}

		} // end of OuterLoop
		return -1;
	}

	public static int findFirstUniqueMap(int[] arr) {

		Map<Integer, Integer> countElements = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			countElements.put(arr[i], 0);
		}
		for (int i = 0; i < arr.length; i++) {
			countElements.put(arr[i], countElements.get(arr[i]) + 1);
		}
		for (int i = 0; i < arr.length; i++) {
			if (countElements.get(arr[i]) <= 1) {
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = {  4, 4, 4, 3, 3, 4, 5, 5, 6, 5, 4 };

		System.out.println(findFirstUniqueBucle(arr));

	}

}
