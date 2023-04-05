/* Given an array. Find number of subsets whose sum is equal to k. */

public class SubsetSum {
	static void countFunc(int[] arr, int n, int k) {
		int count = 0;
		for (int i = 0; i < (1 << n); i++) {
			int sum = 0;
			int index = 0, pos = i;
			while (pos > 0) {
				if ((pos & 1) == 1) {
					sum += arr[index];
				}
				pos = pos >> 1;
				index++;
			}
			if (sum == k) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 8, 3, 7, 5, 15 };
		int k = 15;
		countFunc(arr, arr.length, k);
	}
}
