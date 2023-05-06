/* Given an sorted count triplets. a[i]+a[j]+a[k] <= T. */

public class countTriplets {
	static void count(int arr[], int T) {
		int cnt = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			int j = i + 1;
			int k = arr.length - 1;
			while (j < k) {
				if (arr[j] + arr[k] > T - arr[i]) {
					k--;
				} else {
					cnt += k - j;
					j++;
				}
			}
		}
		System.out.print(cnt);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 7, 9, 11 };
		count(arr, 15);
	}
}
