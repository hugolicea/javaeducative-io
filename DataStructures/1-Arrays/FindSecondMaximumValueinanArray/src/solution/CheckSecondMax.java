package solution;

public class CheckSecondMax {

	public static int findSecondMaximum(int[] arr) {

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] < max) {
				secondMax = arr[i];
			}
		}

		return secondMax;
	}

	public static void main(String[] args) {
		// int[] arr = { 4, 2, 5, 0, 1 };

		int[] arr = { -2, -33, -10, -456 };

		System.out.println(findSecondMaximum(arr));

	}

}
