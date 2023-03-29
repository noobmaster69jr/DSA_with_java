
public class ArraySortedOrNot {
	static boolean isSorted(int[] arr, int i) {
		if (i == arr.length - 1) {
			return true;
		}
		return arr[i] < arr[i + 1] && isSorted(arr, i + 1);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 6, 7 };
		System.out.println(isSorted(arr, 0));

	}

}
