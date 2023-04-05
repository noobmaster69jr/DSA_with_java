import java.util.HashSet;

/*Given an array of positive and negative numbers,
 find if there is a subarray (of size at least one) with 0 sum.*/

public class ZeroSubarrSum {
	public static boolean subarrySum(int[] arr) {
		HashSet<Integer> h = new HashSet<Integer>();
		int preSum = 0;
		for (int i = 0; i < arr.length; i++) {
			preSum += arr[i];
			if (h.contains(preSum)) {
				return true;
			}
			if (preSum == 0) {
				return true;
			}
			h.add(arr[i]);
		}
		return false;

	}

	public static void main(String[] args) {
		int arr[] = { 2, 1, 5, 1 };
		System.out.print(subarrySum(arr));
	}
}
