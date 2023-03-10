/**
 * Given a binary array of size N, we can replace a single 0 with 1, find the
 * max consecutive 1's that we get in the array
 */
public class BinaryArray {
	static void maxConsecutive(int[] arr, int n) {
		int result = 0;
		// O(N) we traverse the array atmost 2N times with no extra space
		for (int i = 0; i < n; i++) {
			int count = 0;
			if (arr[i] == 0) {
				if (i != 0) {
					int j = i - 1;
					while (j >= 0 && arr[j] == 1) {
						j--;
						count++;
					}
				}
				if (i != n - 1) {
					int j = i + 1;
					while (j <= n - 1 && arr[j] == 1) {
						j++;
						count++;
					}
				}
				result = Math.max(result, count + 1);
			}
		}
		System.out.print(result);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 0, 1, 1, 1, 1 };
		maxConsecutive(arr, arr.length);
	}
}
