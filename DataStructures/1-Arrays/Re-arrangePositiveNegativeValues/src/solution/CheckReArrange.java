package solution;

public class CheckReArrange {

	public static void reArrange(int[] arr) {

		int positiveIndex = 0;
		int negativeIndex = 0;
		int aux = 0;

		while (negativeIndex < arr.length) {

			if (arr[positiveIndex] >= 0 && arr[negativeIndex] < 0) {
				aux = arr[positiveIndex];
				arr[positiveIndex] = arr[negativeIndex];
				arr[negativeIndex] = aux;
			} else if (arr[positiveIndex] <= 0) {
				positiveIndex++;

			} else if (arr[negativeIndex] > 0) {
				negativeIndex++;
			}
		}

	}

	public static void reArrange(int[] arr, int a) {

		int[] auxArr = new int[arr.length];
		int leftIndex = 0;
		int rightIndex = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				auxArr[leftIndex++] = arr[i];
			} else {
				auxArr[rightIndex--] = arr[i];
			}

		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = auxArr[i];
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

		int[] arr = { 10, -1, 20, 4, 5, -9, -6 };
		reArrange(arr);

		System.out.println(arrToString(arr));

	}

}
