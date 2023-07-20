package binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// BFS is also called level order traversal

public class LevelOrderTraversal {
	static void printKthLevel(Node root, int level, int k) {
		if (root == null)
			return;
		if (level == k) {
			System.out.print(root.data + " ");
		}
		printKthLevel(root.left, level + 1, k);
		printKthLevel(root.right, level + 1, k);
	}

	static int height(Node root) {
		if (root == null)
			return 0;
		int h1 = height(root.left);
		int h2 = height(root.right);
		return 1 + Math.max(h1, h2);
	}

	// level order traversal with recursion
	static void recTraversal(Node root) {
		for (int i = 0; i < height(root); i++) {
			printKthLevel(root, 0, i);
			System.out.println();
		}
	}

	static void itrTraversal(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while (!q.isEmpty()) {
			Node n = q.poll();

			if (n == null) {
				System.out.println();
				if (!q.isEmpty()) {
					q.add(null);
				}
			} else {
				System.out.print(n.data + " ");
				if (n.left != null) {
					q.add(n.left);
				}
				if (n.right != null) {
					q.add(n.right);
				}
			}

		}
	}

	// print left view

	static void printLeftViewItr(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		System.out.print(root.data + " ");
		while (!q.isEmpty()) {
			Node n = q.poll();

			if (n == null) {
				if (!q.isEmpty()) {
					System.out.print(q.peek().data + " ");
					q.add(null);
				}
			} else {
				if (n.left != null) {
					q.add(n.left);
				}
				if (n.right != null) {
					q.add(n.right);
				}
			}

		}
	}

	// print right view

	static void printRightViewItr(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		System.out.print(root.data + " ");
		while (!q.isEmpty()) {
			Node n = q.poll();

			if (n == null) {
				if (!q.isEmpty()) {
					System.out.print(q.peek().data + " ");
					q.add(null);
				}
			} else {

				if (n.right != null) {
					q.add(n.right);
				}
				if (n.left != null) {
					q.add(n.left);
				}

			}

		}
	}

	// building tree with level order traversal
	static Node buildTree() {
		// here we are considering the data is given in level order way
		Queue<Node> q = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();

		if (data == -1)
			return null;
		Node root = new Node(data);
		q.add(root);
		while (!q.isEmpty()) {
			Node n = q.poll();
			int l = sc.nextInt();
			int r = sc.nextInt();
			if (l == -1) {
				n.left = null;
			} else {
				n.left = new Node(l);
				q.add(n.left);
			}
			if (r == -1) {
				n.right = null;
			} else {
				n.right = new Node(r);
				q.add(n.right);
			}
		}

		return root;
	}

	public static void main(String[] args) {
		Node root = buildTree();

		itrTraversal(root);

		System.out.println();
		printLeftViewItr(root);

		System.out.println();
		printRightViewItr(root);
	}
}

/*
 * i/p: 3 9 8 -1 6 2 -7 -1 -1 4 8 -1 -1 -1 -1 10 -1 -1 -1
 * 
 */
