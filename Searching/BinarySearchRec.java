
public class BinarySearchRec {
	static int search(int[] arr, int key, int low, int high) {
		if (low > high)
			return -1;

		int mid = low + (high - low) / 2;
		if (arr[mid] == key)
			return mid;

		else if (arr[mid] > key)
			return search(arr, key, low, mid - 1);
		else
			return search(arr, key, mid + 1, high);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int key = 5;
		System.out.println(search(arr, key, 0, arr.length - 1));
	}
}
