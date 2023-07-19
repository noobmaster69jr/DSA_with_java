import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstK {

	static void reverseK_ele(Queue<Integer> q, int k) {
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < k; i++) {
			s.push(q.peek());
			q.remove();
		}
		while (!s.isEmpty()) {
			q.add(s.pop());
		}
		for (int i = 0; i < q.size() - k; i++) {
			q.add(q.remove());
		}
	}

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);

		reverseK_ele(queue, 3);

		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

}
