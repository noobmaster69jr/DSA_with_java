/* Given a array find the no of unique elements */

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinct {
	static void count(Integer[] arr) {
		HashSet<Integer> s = new HashSet<>(Arrays.asList(arr));
		System.out.println(s.size());
	}

	public static void main(String[] args) {
		Integer[] arr = { 3, 5, 2, 1, 2, 5, 3 };
		count(arr);
	}
}
