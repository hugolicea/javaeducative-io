package solution;

public class CheckRotateArray {

	public static int[] rotateArray(int[] arr, int a) {

		int[] resultArr = new int[arr.length];

		resultArr[0] = arr[arr.length - 1];

		for (int i = 0; i < arr.length - 1; i++) {
			resultArr[i + 1] = arr[i];
		}

		return resultArr;
	}

	public static void rotateArray(int[] arr, int a,int b) {

		int[] resultArr = new int[arr.length];

		resultArr[0] = arr[arr.length - 1];

		for (int i = 0; i < arr.length - 1; i++) {
			resultArr[i + 1] = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = resultArr[i];
		}

	}

	public static void rotateArray(int[] arr, int a, int b, int c) {

		int leftPointer = 0;
		int rightPointer = arr.length - 1;
		int[] auxArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			auxArr[i] = arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				arr[i] = auxArr[rightPointer];
			} else {
				arr[i] = auxArr[i - 1];
			}
			System.out.println(arr[i]);
		}

	}
	
	public static void rotateArray(int[] arr, String a) {

	    //Store last element of Array.
	    //Start from the Second last and Right Shift the Array by one.
	    //Store the last element saved on the first index of the Array.
	    int lastElement = arr[arr.length - 1];

	    for (int i = arr.length - 1; i > 0; i--) {

	      arr[i] = arr[i - 1];
	    }

	    arr[0] = lastElement;
	  } //end of rotateArray



	public static String arrToString(int[] arr) {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			result += " " + arr[i];
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println(arrToString(rotateArray(arr, 1)));
	}

}
