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

	static Node mid_element(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node first = head.next, second = head;
		while (first != null && first.next != null) {
			first = first.next.next;
			second = second.next;
		}

		return second;
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
		// find nth node from the last
	static int find_nth_node(Node head, int pos) {
		if (head == null) {
			return -1;
		}
		Node first = head, second = head;

		for (int i = 0; i < pos; i++) {
			if (first == null)
				return -1;
			first = first.next;
		}

		while (first != null) {
			first = first.next;
			second = second.next;
		}
		return second.data;
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

	static Node merge(Node a, Node b) {
		if (a == null)
			return b;
		if (b == null)
			return a;

		Node head = null;
		if (a.data <= b.data) {
			head = a;
			head.next = merge(a.next, b);
		} else {
			head = b;
			head.next = merge(a, b.next);
		}
		return head;
	}

	static Node merge_sort(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node mid = mid_element(head);
		Node a = head;
		Node b = mid.next;
		mid.next = null;
		a = merge_sort(a);
		b = merge_sort(b);
		return merge(a, b);
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
		int result = find_nth_node(head, 2);
		if (result == -1) {
			System.out.println("position out of scope");
		} else {
			System.out.println("element at pos is : " + result);
		}
	}
}
