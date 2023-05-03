
public class HoaresQsort {
	static int partition(int arr[], int low, int high) {
		int pivot = arr[low];
		int i = low - 1;
		int j = high + 1;
		while (true) {
			do {
				i++;
			} while (arr[i] < pivot);
			do {
				j--;
			} while (arr[j] > pivot);
			if (i >= j)
				return j;

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	static void qsort(int[] arr, int l, int h) {
		if (l < h) {
			int p = partition(arr, l, h);
			qsort(arr, l, p);
			qsort(arr, p + 1, h);
		}
	}

	public static void main(String[] args) {

		int arr[] = { 8, 4, 7, 9, 3, 10, 5 };
		qsort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
