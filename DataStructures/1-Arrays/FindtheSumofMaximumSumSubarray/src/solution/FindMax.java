package solution;

public class FindMax {

	public static int findMaxSumSubArrayOwn(int[] arr) {
		int sum = 0;
		int maxSum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (j == 0) {
					maxSum = sum;
				} else if (maxSum < sum) {
					maxSum = sum;
				}
			}
			sum = 0;
		}
		return maxSum;
	}

	public static int findMaxSumSubArrayFirst(int[] arr) {
		int maxSum = 0;
		int newSum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				newSum += arr[j];
				if (j == 0) {
					maxSum = newSum;
				} else if (maxSum < newSum) {
					maxSum = newSum;
				}
			}
			newSum = 0;
		}
		return maxSum;
	}

	public static int findMaxSumSubArrayBest(int[] arr) {

		if (arr.length < 1) {
			return 0;
		}

		int maxSum = arr[0];
		int sum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (sum >= 0)
				sum += arr[i];
			else
				sum = arr[i];

			if (sum > maxSum)
				maxSum = sum;

		}
		return maxSum;
	}

	public static int findMaxSumSubArrayEd(int[] arr) {
		if (arr.length < 1) {
			return 0;
		}

		int currMax = arr[0];
		int globalMax = arr[0];
		int lengtharray = arr.length;
		for (int i = 1; i < lengtharray; i++) {
			if (currMax < 0) {
				currMax = arr[i];
			} else {
				currMax += arr[i];
			}

			if (globalMax < currMax) {
				globalMax = currMax;
			}
		}
		return globalMax;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 7, -2, -5, 10, -1 };
		int[] arr0 = { -5, -13, -2, -4 };
		int[] arr1 = { 5, 6, -3, 7, -13, 8, -2, 5, -6, 7, -11, 3, 10, -10, -6, -10, 7, 2 };

		System.out.println(findMaxSumSubArrayOwn(arr));
		System.out.println(findMaxSumSubArrayOwn(arr1));
		System.err.println(findMaxSumSubArrayBest(arr));
		System.err.println(findMaxSumSubArrayBest(arr1));
		System.err.println(findMaxSumSubArrayEd(arr));
		System.err.println(findMaxSumSubArrayEd(arr1));
	}

}
