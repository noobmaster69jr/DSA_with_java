
public class CountingSort {
	static void sort(int[] arr, int k) {
		int count[] = new int[k];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		for (int i = 1; i < count.length; i++) {
			count[i] = count[i] + count[i - 1];
			// gives us the no of elements less than or equal to at this position
		}
		int output[] = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			output[count[arr[i]] - 1] = arr[i];
			count[arr[i]]--;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = output[i];
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 2, 0, 3, 2, 0 };
		int k = 5;
		sort(arr, k);
		for (int i : arr)
			System.out.print(i + " ");
	}
}
