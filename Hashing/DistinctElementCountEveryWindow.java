/*Given an array of size N.calaculate the no of distinct elements in every subarray of size k*/

import java.util.HashMap;

public class DistinctElementCountEveryWindow {
	static void printDistinct(int[] arr, int n, int k) {
		HashMap<Integer, Integer> h = new HashMap<>();

		for (int i = 0; i < k; i++) {
			h.put(arr[i], h.getOrDefault(arr[i], 0) + 1);
		}
		System.out.println(h.size());
		for (int i = k; i < n; i++) {
			h.put(arr[i - k], h.get(arr[i - k]) - 1);
			if (h.get(arr[i - k]) == 0) {
				h.remove(arr[i - k]);
			}
			h.put(arr[i], h.getOrDefault(arr[i], 0) + 1);
			System.out.println(h.size());
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 10, 10, 5, 3, 20, 5 };

		int n = arr.length;
		int k = 4;
		printDistinct(arr, n, k);

	}
}
