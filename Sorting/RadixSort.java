
public class RadixSort {
	static void radix(int[] arr) {
		int mx = arr[0];
		for (int i = 1; i < arr.length; i++) {
			mx = Math.max(arr[i], mx);
		}
		for (int exp = 1; mx / exp > 0; exp *= 10) {
			count_sort(arr, arr.length, exp);
		}
	}

	static void count_sort(int[] arr, int n, int exp) {
		int count[] = new int[10];
		for (int i = 0; i < n; i++) {
			count[(arr[i] / exp) % 10]++;
		}
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}
		int output[] = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			output[count[(arr[i] / exp) % 10] - 1] = arr[i];
			count[(arr[i] / exp) % 10]--;
		}
		for (int i = 0; i < n; i++) {
			arr[i] = output[i];
		}
	}

	public static void main(String[] args) {
		int arr[] = { 319, 212, 6, 8, 100, 50 };
		radix(arr);
		for (int i : arr)
			System.out.print(i + " ");
	}
}
