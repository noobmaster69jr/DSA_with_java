/**
 * Find the equilibrium point if exists, equilibrium point is when the sum of
 * all elements is equal to sum of all elements in the right.
 */
public class EquilibriumPoint {

	static void checkEquilibrium(int arr[], int n) {
		int prefixSum[] = new int[n];
		prefixSum[0] = arr[0];
		for (int i = 1; i < n; i++) {
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		}
		int leftSum = 0, rightSum;
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				leftSum = prefixSum[i - 1];
			}
			rightSum = prefixSum[n - 1] - prefixSum[i];
			if (leftSum == rightSum) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String args[]) {
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 }, n = arr.length;

		checkEquilibrium(arr, n);

	}

}
