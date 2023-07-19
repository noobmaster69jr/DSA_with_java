/*Given N element find max ele in given each k window */

import java.util.ArrayDeque;

public class DequeMaxEleKwindow {
	static void maxEle(int[] arr, int k) {
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		for (int i = 0; i < k; i++) {
			while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
				deque.removeLast();
			}
			deque.add(i);
		}
		for (int i = k; i < arr.length; i++) {
			System.out.print(arr[deque.peekFirst()] + " ");

			while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
				deque.removeFirst();
			}

			while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
				deque.removeLast();
			}

			deque.add(i);
		}
		System.out.print(arr[deque.peekFirst()]);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 1, 8, 9, 7, 6, 5, 11, 3 };
		maxEle(arr, 3);
	}
}
