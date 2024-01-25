package solution;

public class CheckMaxMin {

	public static void maxMin(int[] arr) {

		int leftIndex = 0;
		int rightIndex = arr.length - 1;
		int[] auxArr = new int[arr.length];
		int i = 0;

		while (leftIndex <= rightIndex) {

			if (leftIndex == rightIndex) {

				auxArr[i++] = arr[rightIndex--];
			} else {
				auxArr[i++] = arr[rightIndex--];
				auxArr[i++] = arr[leftIndex++];
			}

		}

		for (int j = 0; j < auxArr.length; j++) {
			arr[j] = auxArr[j];
		}

	}

	public static void maxMin(int[] arr, int a, int b) {
		int maxIdx = arr.length - 1;
		int minIdx = 0;
		int maxElem = arr[maxIdx] + 1; // store any element that is greater than the maximum element in the array
		for (int i = 0; i < arr.length; i++) {
			// at even indices we will store maximum elements
			if (i % 2 == 0) {
				arr[i] += (arr[maxIdx] % maxElem) * maxElem;
				maxIdx -= 1;
			} else { // at odd indices we will store minimum elements
				arr[i] += (arr[minIdx] % maxElem) * maxElem;
				minIdx += 1;
			}
		}
		// dividing with maxElem to get original values.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / maxElem;
		}
	}

	public static void maxMin(int[] arr, int a) {

		int leftPointer = 0;
		int rightPointer = arr.length - 1;
		int[] auxArr = new int[arr.length];
		int i = 0;

		while (leftPointer <= rightPointer) {
			if (leftPointer == rightPointer) {
				auxArr[i] = arr[rightPointer];
			} else {
				auxArr[i] = arr[rightPointer];
				auxArr[i + 1] = arr[leftPointer];
			}
			leftPointer++;
			rightPointer--;
			i += 2;
		}
		for (int j = 0; j < arr.length; j++) {
			arr[j] = auxArr[j];
		}

		// Write - Your - Code
	}

	public static String arrToString(int[] arr) {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			result += " " + arr[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int[] arr1 = { 1, 2, 3, 4, 5 };

		maxMin(arr1, 1, 2);
		System.out.println(arrToString(arr1));

		maxMin(arr, 1, 2);
		System.out.println(arrToString(arr));

	}

}
