/* Given 2 sorted arrays , check if the second array is subsequence of array 1. */
public class SubseqArr {
	static boolean isSubseq(int[] arr1, int[] arr2) {
		int i = 0, j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				i++;
				j++;
			} else {
				i++;
			}
		}
		if (j == arr2.length)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 5, 7, 9 };
		int arr2[] = { 5, 7, 9 };
		if (isSubseq(arr1, arr2)) {
			System.out.print("It is a Subsequence");
		} else {
			System.out.print("Not a Subsequence");
		}
	}
}
