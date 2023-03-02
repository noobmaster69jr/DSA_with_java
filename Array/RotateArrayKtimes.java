import java.util.Scanner;

/**
 * Given an array, rotate it k times
 *
 */
public class RotateArrayKtimes {

	static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

	/**
	 * we are left rotating this array , we can also do right rotation similarly by
	 * rotating entire array intially
	 */
	static void rotate(int[] arr, int k, int n) {
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);
		reverse(arr, 0, n - 1);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 2, 3, 4, 5 };
		int k = 3;
		rotate(arr, k, arr.length);
		sc.close();
	}
}
