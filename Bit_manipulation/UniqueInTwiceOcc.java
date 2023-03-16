
public class UniqueInTwiceOcc {
	static void unique(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}
		System.out.print(ans);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 5, 5, 1, 9, 3, 9 };
		unique(arr);
	}
}
