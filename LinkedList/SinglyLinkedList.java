class Node {
	int data;
	Node next;

	Node(int x) {
		this.data = x;
		this.next = null;
	}
}

public class SinglyLinkedList {
	static Node insert_at_beginning(Node head, int x) {
		Node item = new Node(x);
		if (head == null)
			return item;
		item.next = head;
		return item;
	}

	static Node insert_at_pos(Node head, int pos, int x) {
		Node insert_node = new Node(x);
		Node curr = head;
		if (pos == 1) {
			insert_node.next = head;
			return insert_node;
		}
		for (int i = 1; i <= pos - 2 && curr != null; i++) {
			curr = curr.next;
		}
		if (curr == null) {
			return head;
		}
		insert_node.next = curr.next;
		curr.next = insert_node;
		return head;

	}

	static Node insert_at_end(Node head, int x) {
		Node temp = new Node(x);
		Node curr = head;
		if (head == null)
			return temp;

		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
		return head;
	}

	static Node delete_at_beg(Node head) {
		if (head == null) {
			return null;
		}
		return head.next;
	}

	static Node delete_at_end(Node head) {
		Node curr = head;
		if (head == null)
			return null;
		if (head.next == null)
			return null;
		while (curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
		return head;
	}
//iterative method
//	static int search(Node head, int key) {
//		Node curr = head;
//		int pos = 1;
//		while (curr != null) {
//			if (curr.data == key) {
//				return pos;
//			}
//			pos++;
//			curr = curr.next;
//		}
//		return -1;
//	}
//	static Node reverse(Node head) {
//		if (head.next == null || head == null)
//			return head;
//		Node curr = head;
//		Node next = null, prev = null;
//		while (curr != null) {
//			next = curr.next;
//			curr.next = prev;
//			prev = curr;
//			curr = next;
//		}
//		return prev;
//	}

//	static Node reverse(Node head) { //recursive method 1
//		if (head == null || head.next == null)
//			return head;
//		Node rest_head = reverse(head.next);
//		Node rest_tail = head.next;
//		rest_tail.next = head;
//		head.next = null;
//		return rest_head;
//	}

	static Node reverse(Node curr, Node prev) {
		if (curr == null)
			return prev;
		Node next = curr.next;
		curr.next = prev;
		return reverse(next, curr);
	}

	static void mid_ele(Node head) {
		if (head == null)
			return;
		Node first = head, second = head;
		while (first != null && first.next != null) {
			first = first.next.next;
			second = second.next;
		}
		System.out.println(second.data);
	}

	static void nth_node(Node head, int pos) {
		if (head == null)
			return;
		Node first = head;
		for (int i = 0; i < pos; i++) {
			if (first == null)
				return;
			first = first.next;
		}
		Node second = head;
		while (first != null) {
			second = second.next;
			first = first.next;
		}
		System.out.println(second.data);
	}

	static int search(Node head, int key, int pos) {
		if (head == null) {
			return -1;
		}
		if (head.data == key) {
			return pos;
		}
		return search(head.next, key, pos + 1);
	}

	static void print(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	// we don't change head here so return type is void
	static void removeSortedDuplicate(Node head) {
		Node curr = head;
		while (curr != null && curr.next != null) {
			if (curr.data == curr.next.data)
				curr.next = curr.next.next;
			else
				curr = curr.next;
		}
	}

	static Node reverseK(Node head, int k) {
		Node curr = head, prevFirst = null;
		boolean isFirst = true;
		while (curr != null) {
			Node first = curr, prev = null;
			int count = 0;
			while (curr != null && count < k) {
				Node next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
				count++;
			}
			if (isFirst) {
				head = prev;
				isFirst = false;
			} else {
				prevFirst.next = prev;
			}
			prevFirst = first;
		}
		return head;
	}

	public static void main(String[] args) {
		Node head = null;
		head = insert_at_beginning(head, 6);
		head = insert_at_beginning(head, 15);
		head = insert_at_beginning(head, 25);
		head = insert_at_beginning(head, 2);
		head = insert_at_beginning(head, 21);
		head = insert_at_beginning(head, 1);

		print(head);
		head = reverseK(head, 3);
		print(head);

	}
}
