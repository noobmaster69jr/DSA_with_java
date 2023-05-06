//Given 2N+1 element find the unique element present(using binary search approach)

public class UniqueElement {

	static int unique(int arr[]) {
		int s = 0;
		int e = arr.length - 1;
		int ans = 0;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (mid == 0 && arr[mid] != arr[mid + 1] || mid == arr.length - 1 && arr[mid] != arr[mid - 1]) {
				return arr[mid];
			}
			if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
				return arr[mid];
			} else if (mid % 2 == 0 && arr[mid] == arr[mid + 1] || mid % 2 != 0 && arr[mid] == arr[mid - 1]) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 2, 2, 4, 4, 5, 5, 6, 6, 8, 8, 9 };
		System.out.print(unique(arr));
	}

}
