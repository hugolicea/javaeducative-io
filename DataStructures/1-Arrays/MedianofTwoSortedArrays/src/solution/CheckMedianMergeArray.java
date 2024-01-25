package solution;

public class CheckMedianMergeArray {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int n1 = nums1.length;
		int n2 = nums2.length;
		if (n1 > n2) {
			return findMedianSortedArrays(nums2, nums1);
		}
		int k = (n1 + n2 + 1) / 2;
		int left = 0;
		int right = n1;
		while (left < right) {
			int m1 = left + (right - left) / 2;
			int m2 = k - m1;
			if (nums1[m1] < nums2[m2 - 1]) {
				left = m1 + 1;
			} else {
				right = m1;
			}
		}
		int m1 = left;
		int m2 = k - left;
		int c1 = Math.max(m1 <= 0 ? Integer.MIN_VALUE : nums1[m1 - 1], m2 <= 0 ? Integer.MIN_VALUE : nums2[m2 - 1]);
		if ((n1 + n2) % 2 == 1) {
			return c1;
		}
		int c2 = Math.min(m1 >= n1 ? Integer.MAX_VALUE : nums1[m1], m2 >= n2 ? Integer.MAX_VALUE : nums2[m2]);
		return (c1 + c2) / 2.0;
	}

	public static void main(String[] args) {
		int[] arr2 = { 5 };
		int[] arr1 = { 1,3,6};

		System.out.println(findMedianSortedArrays(arr1, arr2));
	}

}

/*
 * The function findMedianSortedArrays takes two sorted integer arrays nums1 and
 * nums2 as input. The function first checks if the length of nums1 is greater
 * than the length of nums2. If it is, the function swaps nums1 and nums2. The
 * function then calculates the variable k as (n1 + n2 + 1) / 2, where n1 and n2
 * are the lengths of nums1 and nums2, respectively. The function initializes
 * two variables left and right to 0 and n1, respectively. The function then
 * enters a while loop that continues until left is no longer less than right.
 * Within the while loop, the function calculates two variables m1 and m2 as
 * left + (right - left) / 2 and k - m1, respectively. The function then checks
 * if nums1[m1] < nums2[m2 - 1]. If it is, the function updates left to m1 + 1.
 * Otherwise, the function updates right to m1. The function then calculates two
 * variables m1 and m2 as left and k - left, respectively. The function then
 * calculates two variables c1 and c2 as the maximum of nums1[m1 - 1] and
 * nums2[m2 - 1] and the minimum of nums1[m1] and nums2[m2], respectively.
 * Finally, the function returns (c1 + c2) / 2.0 if the sum of the lengths of
 * nums1 and nums2 is even, or c1 if it is odd.
 * 
 * 
 */