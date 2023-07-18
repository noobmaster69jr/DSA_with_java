/* stock span problem */

import java.util.ArrayDeque;

public class StockSpanProblem {

	static void printSpan(int[] arr, int n) {
		// O(N) optimized solution
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		for (int i = 0; i < n; i++) {
			// we are only keeping track of index of elements greater in left
			while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				System.out.print(1 + " ");
			} else {
				System.out.print((i - stack.peek()) + " ");
			}
			stack.push(i);
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 18, 12, 13, 14, 11, 16 };

		printSpan(arr, arr.length);

	}
}
