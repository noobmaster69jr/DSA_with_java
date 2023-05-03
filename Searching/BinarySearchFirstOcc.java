/* Given an array with duplicate elements present in it find its first occurence */

public class BinarySearchFirstOcc {
	static int search(int arr[], int low, int high, int key) {
		int res = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] < key) {
				low = mid + 1;
			} else if (arr[mid] > key) {
				high = mid - 1;
			} else {
				res = mid;
				high = mid - 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 4, 5, 5, 7, 9 };
		int key = 4;
		int ans = search(arr, 0, arr.length - 1, key);
		System.out.print(ans);
	}
}
