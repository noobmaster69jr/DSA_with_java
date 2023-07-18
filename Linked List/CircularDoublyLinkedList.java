class Cdnode {
	int data;
	Cdnode next;
	Cdnode prev;

	Cdnode(int d) {
		data = d;
	}
}

public class CircularDoublyLinkedList {
	static Cdnode insert_at_beg(Cdnode head, int x) {
		Cdnode node = new Cdnode(x);
		if (head == null) {
			node.prev = node;
			node.next = node;
			return node;
		}
		node.prev = head.prev;
		node.next = head;
		head.prev.next = node;
		head.prev = node;
		return node;
	}

	static Cdnode insert_at_end(Cdnode head, int x) {
		Cdnode node = new Cdnode(x);
		if (head == null) {
			node.prev = node;
			node.next = node;
			return node;
		}
		node.prev = head.prev;
		node.next = head;
		head.prev.next = node;
		head.prev = node;
		return head;
	}

	static void print(Cdnode head) {
		Cdnode curr = head;
		do {
			System.out.print(curr.data + " ");
			curr = curr.next;
		} while (curr != head);
		System.out.println();
	}

	public static void main(String[] args) {
		Cdnode head = null;
		head = insert_at_beg(head, 10);
		head = insert_at_beg(head, 9);
		head = insert_at_beg(head, 8);
		head = insert_at_beg(head, 7);
		print(head);
		head = insert_at_end(head, 16);
		head = insert_at_end(head, 20);
		print(head);
	}
}
