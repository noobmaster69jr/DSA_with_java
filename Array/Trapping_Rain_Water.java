
public class Trapping_Rain_Water {
	static int tpWater(int[] arr) {
		int n = arr.length;
		int[] leftmax = new int[n];
		int rightmax[] = new int[n];
		leftmax[0] = arr[0];
		rightmax[n - 1] = arr[n - 1];
		int store = 0;
		for (int i = 1; i < n; i++) {
			leftmax[i] = Math.max(leftmax[i - 1], arr[i]);
		}
		for (int k = n - 2; k >= 0; k--) {
			rightmax[k] = Math.max(rightmax[k + 1], arr[k]);
		}
		for (int i = 1; i < n - 1; i++) {
			if (leftmax[i] > arr[i] && rightmax[i] > arr[i]) {
				store += Math.min(leftmax[i], rightmax[i]) - arr[i];
			}
		}
		return store;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, 0, 7, 3 };

		System.out.println(tpWater(arr));
	}
}
