package solution;

import java.util.Arrays;

public class CheckSum {

	public static int[] findSum(int[] arr, int n) {

		int[] resArr = new int[2];

		int i = 0;
		int j = arr.length - 1;
		int sum = 0;

		Arrays.sort(arr);

		while (i != j) {
			sum = arr[i] + arr[j];
			if (sum == n) {
				resArr[0] = arr[i];
				resArr[1] = arr[j];
				return resArr;
			} else if (sum < n)
				i++;
			else
				j--;
		}

		return resArr;

	}

	public static String arrToString(int[] arr) {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			result += " " + arr[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int n = 27;
		int[] arr1 = { 1, 21, 3, 14, 5, 60, 7, 6 };

		System.out.println(arrToString(findSum(arr1, n)));

	}

}
