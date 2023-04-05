import java.util.HashMap;

/*find the length of the largest continuous sequence in the array which sums to zero*/

//public class LgContSeqZeroSum {
//	static void LongFunc(int[] arr, int n) {
//		int[] prefixSum = new int[n];
//		prefixSum[0] = arr[0];
//		for (int i = 1; i < n; i++) {
//			prefixSum[i] = prefixSum[i - 1] + arr[i];
//		}
//		HashMap<Integer, Integer> h = new HashMap<>();
//		h.put(0, 0);
//		int maxLength = 0;
//		for (int i = 0; i < n; i++) {
//			if (h.containsKey(prefixSum[i])) {
//				int j = h.get(prefixSum[i]);
//				if (maxLength < i - j + 1) {
//					maxLength = i - j + 1;
//				}
//			} else {
//				h.put(prefixSum[i], i + 1);
//			}
//		}
//		System.out.print(maxLength);
//	}

public class LgContSeqZeroSum {
	static void LongFunc(int[] arr, int n) {
		int preSum = 0;
		HashMap<Integer, Integer> h = new HashMap<>();
		int start = 0, end = 0;
		h.put(0, -1);
		int maxLength = 0;
		for (int i = 0; i < n; i++) {
			preSum += arr[i];
			if (h.containsKey(preSum)) {
				int j = h.get(preSum);
				if (maxLength < i - j) {
					maxLength = i - j;
					start = j + 1;
					end = i;
				}
			} else {
				h.put(preSum, i);
			}
		}
		while (start <= end) {
			System.out.print(arr[start] + " ");
			start++;
		}
		System.out.print("\n The max Length is " + maxLength);
	}

	public static void main(String[] args) {
		int arr[] = { 14, -1, 1, -6, 1, 5, 12, 17 };
		LongFunc(arr, arr.length);
	}
}
