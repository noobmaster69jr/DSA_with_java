
/**
 * Given an array find the maximum subarray sum
 * approach: kadane's algorithm
 */

import java.util.Scanner;

public class LargestSubarraySum {
	static void maxSubarraySum(int[] arr) {
		int result = Integer.MIN_VALUE; // we are using a modified kadane's algorithm
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum < arr[i]) {
				sum = arr[i];
			}
			if (result < sum) {
				result = sum;
			}
		}
		System.out.print(result);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		maxSubarraySum(arr);
		sc.close();
	}
}
