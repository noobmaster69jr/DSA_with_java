package Trie;

import java.util.HashMap;

class Node {
	boolean isTerminal;
	HashMap<Character, Node> hm;

	Node() {
		isTerminal = false;
		hm = new HashMap<>();
	}
}

public class Trie {

	static Node root;

	static void insert(String str) {

		Node temp = root;
		for (int i = 0; i < str.length(); i++) {
			if (!temp.hm.containsKey(str.charAt(i))) {
				Node newNode = new Node();
				temp.hm.put(str.charAt(i), newNode);
			}
			temp = temp.hm.get(str.charAt(i));
		}
		temp.isTerminal = true;
	}

	static boolean search(String str) {
		Node temp = root;
		for (int i = 0; i < str.length(); i++) {
			if (temp.hm.containsKey(str.charAt(i))) {
				temp = temp.hm.get(str.charAt(i));
			} else {
				return false;
			}
		}
		return temp.isTerminal;
	}

	public static void main(String[] args) {
		root = new Node();
		String keys[] = { "the", "a", "there", "answer", "any", "by", "bye", "their" };
		for (int i = 0; i < keys.length; i++) {
			insert(keys[i]);
		}

		if (search("by") == true) {
			System.out.println("present");
		} else {
			System.out.println("not present");
		}

		if (search("banser") == true) {
			System.out.println("present");
		} else {
			System.out.println("not present");
		}

		if (search("the") == true) {
			System.out.println("present");
		} else {
			System.out.println("not present");
		}
	}
}
