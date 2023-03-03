/**
 * Given an array find number of ways index i can be present in all of subarray
 * approach: number of times index i start * index i end
 *
 */
public class WaysIndex_I_IsPresent {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 7, 9 };
		int n = arr.length;
		int i = 3;
		int start = i + 1;
		int end = n - i;
		System.out.print(start * end);
	}
}
