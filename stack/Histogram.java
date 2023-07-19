
/* given an array of integers find the largest rectangular area under Histogram
 *  i/p : 2, 4, 3, 6, 1
 *  o/p : [8, 4, 9, 6, 5]
 *  brute-force : use 2 loops , traverse and find area for each point - O(N^2)
 * */
import java.util.Stack;

public class Histogram {

	static int[] nearestLeftSmall(int arr[]) {

		int[] out = new int[arr.length];
		Stack<Integer> s = new Stack<>();

		for (int i = 0; i < arr.length; i++) {
			while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
				s.pop();
			}
			if (s.isEmpty()) {
				out[i] = -1;
			} else {
				out[i] = s.peek();
			}
			s.push(i);
		}
		return out;
	}

	static int[] nearestRightSmall(int arr[]) {

		int[] out = new int[arr.length];
		Stack<Integer> s = new Stack<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
				s.pop();
			}
			if (s.isEmpty()) {
				out[i] = arr.length;
			} else {
				out[i] = s.peek();
			}
			s.push(i);
		}
		return out;
	}

	public static int solution(int[] arr) {
		// precomputing
		int p1[] = nearestLeftSmall(arr);
		int p2[] = nearestRightSmall(arr);
		int max = 0;

		// optimized O(1) solution
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i] * (p2[i] - p1[i] - 1));
		}
		return max;
	}

	public static void main(String[] args) {

		int arr[] = { 2, 4, 3, 6, 1 };

		System.out.print(solution(arr));

	}
}
