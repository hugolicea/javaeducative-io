package solution;

public class ProductArray {

	public static int[] findProductByDivision(int arr[]) {

		int[] result = new int[arr.length];
		int temp = 1;

		for (int i = 0; i < arr.length; i++) {
			temp *= arr[i];
		}

		for (int resu = 0; resu < arr.length; resu++) {
			result[resu] = temp / arr[resu];
		}

		return result;
	}

	public static int[] findProduct(int arr[]) {
		int n = arr.length;
		int i, temp = 1;

		// Allocation of result array
		int result[] = new int[n];

		// Product of elements on left side excluding arr[i]
		for (i = 0; i < n; i++) {
			result[i] = temp;
			temp *= arr[i];
		}

		// Initializing temp to 1 for product on right side
		temp = 1;

		// Product of elements on right side excluding arr[i]
		for (i = n - 1; i >= 0; i--) {
			result[i] *= temp;
			temp *= arr[i];
		}

		return result;
	}

	public static int[] productExceptItself(int[] arr) {
		int s = arr.length;
		int[] left = new int[s];
		int[] right = new int[s];
		int[] result = new int[s];

		left[0] = 1;
		right[s - 1] = 1;

		for (int i = 1; i < arr.length; i++) {
			left[i] = left[i - 1] * arr[i - 1];
		}

		for (int i = arr.length - 2; i >= 0; i--) {
			right[i] = right[i + 1] * arr[i + 1];
		}
		for (int i = 0; i < result.length; i++) {
			result[i] = left[i] * right[i];
		}

		return result;

	}

	public static String arrayToString(int arr[]) {
		if (arr.length > 0) {
			String result = "";
			for (int i = 0; i < arr.length; i++) {
				result += arr[i] + " ";
			}
			return result;
		} else {
			return "Empty Array!";
		}
	}

	public static void main(String args[]) {

		// int[] arr = { 1, 2, 3, 4, 5 };

		int[] arr = { -1, 1, 0, -3, 3 };

		System.out.println("Array before product: " + arrayToString(arr));

		int[] prodArray = findProduct(arr);

		System.out.println("Array after product: " + arrayToString(prodArray));

		//System.out.println(arrayToString(findProductByDivision(arr)));

		System.out.println(arrayToString(productExceptItself(arr)));
	}

}
