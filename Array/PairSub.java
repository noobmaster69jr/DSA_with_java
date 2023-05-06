/*Given an array of N sorted elements, check if there is pair(i, j) such that a[i]-a[j] == k*/

public class PairSub {
	static boolean check(int[] arr, int k) {
		int i = 0;
		int j = 1;
		while (j < arr.length) { // O(N)
			if (arr[j] - arr[i] == k) {
				return true;
			} else if (arr[j] - arr[i] > k) {
				i++;
				if (i == j)
					j++;
			} else { // arr[j] - arr[i] < k
				j++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 3, 6, 8, 11, 14, 18, 25 };
		int k = 22;
		if (check(arr, k)) {
			System.out.print("Pair exists");
		} else {
			System.out.print("Pair does not exist");
		}

	}
}
