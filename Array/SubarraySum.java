/**
 * find the sum all subarrays starting from index i
 *
 */
public class SubarraySum {

	static void sum(int[] arr, int i) {
		int n = arr.length;
		int sum = 0;
		for (; i < n; i++) { // Tc - O(N) sc- O(1)
			sum += arr[i];
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, };
		sum(arr, 1);

	}

}
