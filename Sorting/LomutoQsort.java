
public class LomutoQsort {
	static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j <= high - 1; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = pivot;
		arr[high] = temp;
		return i + 1;
	}

	static void qsort(int[] arr, int l, int h) {
		if (l < h) {
			int p = partition(arr, l, h);
			qsort(arr, l, p - 1);
			qsort(arr, p + 1, h);
		}
	}

	public static void main(String[] args) {

		int arr[] = { 5, 4, 8, 2, 7 };
		qsort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
