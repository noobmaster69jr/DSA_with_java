package linkedlist;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class SinglyLinkedList {

	static Node insert_at_beginning(Node head, int data) {
		Node temp = new Node(data);
		if (head == null) {
			return temp;
		}
		temp.next = head;
		return temp;
	}

	static Node insert_at_pos(Node head, int pos, int data) {
		Node node = new Node(data);
		Node curr = head;

		if (pos < 1) {
			System.out.print("Negative index, can't insert");
			return head;
		}
		if (pos == 1) {
			node.next = head;
			return node;
		}

		for (int i = 1; i <= pos - 2 && curr != null; i++) {
			curr = curr.next;
		}

		if (curr == null) {
			return head;
		}

		node.next = curr.next;
		curr.next = node;

		return head;
	}

	static Node insert_at_end(Node head, int data) {
		Node node = new Node(data);
		Node temp = head;
		if (head == null) {
			return node;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
		return head;
	}

	static void print(Node head) {
		Node temp = head;
		if (temp == null) {
			System.out.print("empty list");
		}
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();

	}

	static Node delete_at_beg(Node head) {
		if (head == null) {
			return head;
		}
		return head.next;
	}

	static Node delete_at_end(Node head) {
		if (head == null) {
			System.out.print("List empty no element to delete");
			return head;
		}
		if (head.next == null) {
			return head.next;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		return head;
	}

	static Node reverse_LL(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node prev = null, next, curr = head;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;
	}

	static int mid_element(Node head) {
		if (head == null) {
			return -1;
		}
		Node first = head, second = head;
		while (first.next != null && first.next.next != null) {
			first = first.next.next;
			second = second.next;
		}

		return second.data;
	}

	static void search(Node head, int key, int pos) {
		if (head == null) {
			System.out.println("The element searching for is not present in the list");
			return;
		}
		if (head.data == key) {
			System.out.println("The element is present at position : " + pos);
			return;
		}
		search(head.next, key, pos + 1);
	}

	public static void main(String[] args) {
		Node head = null;
		print(head);
		head = insert_at_beginning(head, 5);
		head = insert_at_beginning(head, 1);
		head = insert_at_pos(head, 2, 6);
		head = insert_at_pos(head, 5, 8);
		head = insert_at_pos(head, 3, 7);
		head = insert_at_end(head, 9);
		System.out.print("After Insert:  ");
		print(head);
		head = delete_at_beg(head);
		head = delete_at_end(head);
		System.out.print("After Delete: ");
		print(head);
		head = reverse_LL(head);
		System.out.print("After reversing : ");
		print(head);
		System.out.println("mid element in the list is " + mid_element(head));
		search(head, 9, 0);
	}
}
