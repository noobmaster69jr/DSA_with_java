import java.util.HashMap;

/* Given an unsorted array, check if there is a pair(i, j) such that
 *  A[i] + A[j] == k && i != j */

public class PairInUnsorted {
	static void freq(Integer[] arr, Integer sum) {
		HashMap<Integer, Integer> h = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (h.containsKey(arr[i])) {
				h.put(arr[i], h.get(arr[i]) + 1);
			} else {
				h.put(arr[i], 1);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (sum - arr[i] == arr[i]) {
				if (h.get(arr[i]) == 2) {
					System.out.println("True");
					return;
				} else {
					System.out.println("False");
					return;
				}
			} else if (h.containsKey(sum - arr[i])) {
				System.out.println("True");
				return;
			}
		}
		System.out.println("False");
	}

	public static void main(String[] args) {
		Integer[] arr = { 6, 4, 1, 3, 2, 2, 1, 7 };
		Integer sum = 13;
		freq(arr, sum);
	}

}
