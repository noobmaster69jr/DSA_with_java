/* Given N distinct unsorted elements. find the kth element if the array was sorted*/

public class QuickSelect {

	static int partition(int arr[], int s, int e, int k) {
		int pivot = arr[e];
		int i = s - 1;
		for (int j = s; j < e; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = pivot;
		arr[e] = temp;
		return i + 1;

	}

	static int quickSelect(int arr[], int s, int e, int k) {
		int p = partition(arr, s, e, k);
		if (p < k) {
			return quickSelect(arr, p + 1, e, k);
		} else if (p == k)
			return arr[p];
		else {
			return quickSelect(arr, s, p - 1, k);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 3, 8, 11, 2, 4, 14 };
		int k = 3;
		System.out.print(quickSelect(arr, 0, arr.length - 1, k));
	}
}
