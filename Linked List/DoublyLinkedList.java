class DNode {
	int data;
	DNode prev;
	DNode next;

	DNode(int d) {
		data = d;
	}
}

public class DoublyLinkedList {
	static DNode delHead(DNode head) {
		if (head == null)
			return null;
		if (head.next == null)
			return null;
		else {
			head = head.next;
			head.prev = null;
			return head;
		}
	}

	static DNode insert_at_beg(DNode head, int data) {
		DNode temp = new DNode(data);
		if (head == null) {
			return temp;
		}
		temp.next = head;
		head.prev = temp;
		return temp;
	}

	static DNode insert_at_end(DNode head, int data) {
		DNode curr = head;
		DNode node = new DNode(data);
		if (head == null) {
			return node;
		}
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = node;
		node.prev = curr;
		return head;
	}

	static DNode reverse(DNode head) {
		if (head == null || head.next == null)
			return head;

		DNode curr = head, temp = null;
		while (curr != null) {
			temp = curr.prev;
			curr.prev = curr.next;
			curr.next = temp;
			curr = curr.prev;
		}
		return temp.prev;
	}

	static DNode delLast(DNode head) {
		DNode curr = head;
		if (curr == null)
			return null;
		if (curr.next == null)
			return null;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.prev.next = null;
		return head;

	}

	static void print(DNode head) {
		DNode curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DNode head = null;
		head = insert_at_beg(head, 5);
		head = insert_at_beg(head, 15);
		head = insert_at_beg(head, 25);
		print(head);
		head = delHead(head);
		print(head);
		head = reverse(head);
		print(head);
		head = delLast(head);
		print(head);
		head = insert_at_end(head, 3);
		head = insert_at_end(head, 13);
		head = insert_at_end(head, 23);
		print(head);
	}
}
