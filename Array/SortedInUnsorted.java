/**
 * Given an array that contains at least 2 integers , one subpart of the array
 * is unsorted and rest array is sorted in increasing order. you need to find
 * the indices of the smallest subarray that need to be sorted so that entire
 * array becomes sorted
 *
 * approach 1: sort copy of the array and compare it with original array from
 * both side tc - O(N log N) , space - O(N)
 *
 * approach 2: find if a element is out of order and update min and max , find
 * min and max position in original array tc - O(N), space- O(1)
 */
public class SortedInUnsorted {
	static boolean isOutOfOrder(int[] arr, int i) {
		if (i == 0) {
			return arr[i] > arr[i + 1];
		} else if (i == arr.length - 1)
			return arr[i] < arr[i - 1];
		else {
			return arr[i] > arr[i + 1] || arr[i] < arr[i - 1];
		}
	}

	static void position(int[] arr, int min, int max) {
		int i = 0;
		int j = arr.length - 1;
		while (arr[i] <= min) {
			i++;
		}
		while (arr[j] >= max) {
			j--;
		}
		System.out.print(i + " " + j);
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 4, 7, 10, 11, 7, 12, 7, 7, 16, 18, 19 };
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (isOutOfOrder(arr, i)) {
				min = Math.min(min, arr[i]);
				max = Math.max(max, arr[i]);
			}
		}
//		System.out.print(min + " " + max);
		position(arr, min, max);

	}
}
