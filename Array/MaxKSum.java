/**
 * Given an array find maximum subarray sum of length k. approach 1: O(N * K)
 * traversing and finding all subarray sum of length k approach 2: O(N) with
 * O(N) space, using prefix sum approach 3: O(N) with no space, using sliding
 * window algorithm
 *
 */
public class MaxKSum {
	static int consSum(int[] arr, int k) {

		int n = arr.length;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		int res = sum;
		for (int j = k; j < n; j++) {
			sum = sum - arr[j - k] + arr[j];
			res = Math.max(res, sum);
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 13, 6, 8, 1, 9 };
		int k = 3;
		System.out.println(consSum(arr, k));
	}
}
