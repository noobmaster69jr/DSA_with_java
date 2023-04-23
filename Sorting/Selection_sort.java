
public class Selection_sort {
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void sort(int[] arr) {
		int n = arr.length;
		int min = 0;
		for (int i = 0; i < n - 1; i++) {

			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			swap(arr, i, min);
			min = i;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 3, 9, 92, 12, 2, 6, 1, 29 };
		for (int i : arr) {
			System.out.print(i + " ");
		}
		sort(arr);
		System.out.println();
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
