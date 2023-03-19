/*bubble sort algorithm 
 * O(N^2) worst case 
 */
public class bubble_sort {
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void sort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean isSorted = true;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					isSorted = false;
				}
			}
			if (isSorted == true)
				break;
		}

	}

	public static void main(String[] args) {
		int arr[] = { 11, 3, 1, 4, 8, 12, 7, 5 };
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
