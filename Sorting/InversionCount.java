/* Given an array. find out no of inversions i < j and a[i] > a[j] */
public class InversionCount {
	static int crossInversion(int arr[], int low, int mid, int high) {

		int n1 = mid - low + 1;
		int n2 = high - mid;
		int left[] = new int[n1];
		int right[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			left[i] = arr[low + i];
		}
		for (int i = 0; i < n2; i++) {
			right[i] = arr[mid + 1 + i];
		}
		int i = 0, j = 0, count = 0, k = low;
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
				count += (mid + 1) - (low + i);
			}
		}
		while (i < n1) {
			arr[k++] = left[i++];
		}
		while (j < n2) {
			arr[k++] = right[j++];
		}
		return count;
	}

	static int inversion(int arr[], int low, int high) {
		int total = 0;
		if (low < high) {
			int mid = (low + high) / 2;
			total += inversion(arr, low, mid);
			total += inversion(arr, mid + 1, high);
			total += crossInversion(arr, low, mid, high);
		}

		return total;
	}

	public static void main(String[] args) {
		int arr[] = { 7, 5, 8, 6, 9, 4 };
		int total = inversion(arr, 0, arr.length - 1);
		System.out.print(total);
	}
}
