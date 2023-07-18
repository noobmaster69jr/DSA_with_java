
/* Given an array of size N, find the nearest smaller number for every element that is present
 * on left
 *  i/p : { 2, 5, 10, 6, 3, 4, 1}
 *  o/p : {-1, 2, 5, 5, 2, 3, -1}
 *  
 *  brute force : use 2 loops, traverse from i -> 0
 * */
import java.util.Stack;

public class NearestLeftSmallest {
	static int[] findLeftSmallest(int[] arr, int[] otp) {
		Stack<Integer> stack = new Stack();

		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() && stack.peek() >= arr[i]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				otp[i] = -1;
			} else {
				otp[i] = stack.peek();
			}
			stack.push(arr[i]);
		}

		return otp;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, 10, 6, 3, 4, 1 };
		int[] otp = new int[arr.length];
		otp = findLeftSmallest(arr, otp);
		for (int i : otp)
			System.out.print(i + " ");
	}
}
