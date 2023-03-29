/*Given an array, find out the first non repeating element */

import java.util.HashMap;

public class FirstNonRepeating {
	static void freq(Integer[] arr) {
		HashMap<Integer, Integer> h = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (h.containsKey(arr[i])) {
				h.put(arr[i], h.get(arr[i]) + 1);
			} else {
				h.put(arr[i], 1);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (h.get(arr[i]) == 1) {
				System.out.println(arr[i]);
				return;
			}
		}
	}

	public static void main(String[] args) {
		Integer[] arr = { 6, 4, 1, 3, 2, 2, 1, 6 };
		freq(arr);
	}
}
