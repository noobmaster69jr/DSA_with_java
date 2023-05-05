
public class SortedKRotated {
	static int BS(int arr[], int low, int high) {
		while (low <= high) {
			if (low == high)
				return low;
			int mid = low + (high - low) / 2;
			if (mid > low && arr[mid] < arr[mid - 1])
				return mid;
			if (mid < high && arr[mid] > arr[mid + 1])
				return mid + 1;
			if (arr[low] > arr[mid])
				return BS(arr, low, mid - 1);
			if (arr[high] < arr[mid])
				return BS(arr, mid + 1, high);
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 1, 2, 3, 4 };
		System.out.print(BS(arr, 0, arr.length - 1));
	}
}
