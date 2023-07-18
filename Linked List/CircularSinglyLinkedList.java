class Cnode {
	int data;
	Cnode next;

	Cnode(int d) {
		data = d;
	}
}

public class CircularSinglyLinkedList {
	static Cnode insert_at_beg(Cnode head, int x) {
		Cnode node = new Cnode(x);
		Cnode curr = head;
		if (curr == null) {
			node.next = node;
			return node;
		}
		// optimised O(1)
		node.next = curr.next;
		curr.next = node;
		int t = curr.data;
		curr.data = node.data;
		node.data = t;
		return head;
	}

	static Cnode insert_at_end(Cnode head, int x) {
		Cnode node = new Cnode(x);
		if (head == null) {
			node.next = node;
			return node;
		} // Optimised soln O(1)
		node.next = head.next;
		head.next = node;
		int temp = head.data;
		head.data = node.data;
		node.data = temp;
		return node;
	}

	static Cnode del_at_beg(Cnode head) {
		if (head == null || head.next == head)
			return null;
		// optimised soln O(1)
		head.data = head.next.data;
		head.next = head.next.next;
		return head;
	}

	static Cnode del_kth(Cnode head, int k) {
		int count = 1;
		if (head == null)
			return head;
		if (k == 1)
			return del_at_beg(head);

		Cnode curr = head;
		for (int i = 0; i < k - 2; i++) {
			curr = curr.next;
		}
		curr.next = curr.next.next;
		return head;
	}

	static void print(Cnode head) {
		Cnode curr = head;
		if (curr == null)
			return;
		while (curr.next != head) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println(curr.data);
	}

	public static void main(String[] args) {
		Cnode head = null;
		head = insert_at_beg(head, 38);
		head = insert_at_beg(head, 28);
		head = insert_at_beg(head, 18);
		head = insert_at_beg(head, 8);
		print(head);
		head = insert_at_end(head, 40);
		head = insert_at_end(head, 45);
		print(head);
		head = del_at_beg(head);
		print(head);
		head = del_kth(head, 5);
		print(head);
	}
}
