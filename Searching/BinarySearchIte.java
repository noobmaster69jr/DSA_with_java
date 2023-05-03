
public class BinarySearchIte {
	static int search(int[] arr, int key) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int key = 5;
		System.out.println(search(arr, key));
	}
}
