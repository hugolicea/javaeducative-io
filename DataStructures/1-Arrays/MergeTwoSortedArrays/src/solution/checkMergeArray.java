package solution;

public class checkMergeArray {

	public static int[] mergeArrays(int[] arr1, int[] arr2) {

		int s1 = arr1.length;
		int s2 = arr2.length;

		int[] resArr = new int[s1 + s2];
		int i = 0, j = 0, k = 0;

		while (i < s1 && j < s2) {

			if (arr1[i] < arr2[j]) {
				resArr[k++] = arr1[i++];
			} else {

				resArr[k++] = arr2[j++];
			}
		}
		while (i < s1) {
			resArr[k++] = arr1[i++];
		}
		while (j < s2) {
			resArr[k++] = arr2[j++];
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

		int[] arr1 = { 1, 3, 5, 7, 9, 10, 17 };
		int[] arr2 = { 2, 4, 6, 8, 11, 12, 13, 15, 16 };

		int[] resArr = mergeArrays(arr1, arr2);

		System.out.println(arrToString(resArr));

	}

}
