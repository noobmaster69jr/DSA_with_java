//Given s1 & s2 check if s2 is a permutation of s1 or not

import java.util.HashMap;

public class CakeWalk {

	static boolean check(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		HashMap<Character, Integer> h = new HashMap<>();
		HashMap<Character, Integer> h2 = new HashMap<>();

		for (int i = 0; i < s1.length(); i++) {
			h.put(s1.charAt(i), h.getOrDefault(s1.charAt(i), 0) + 1);
			h2.put(s2.charAt(i), h2.getOrDefault(s2.charAt(i), 0) + 1);
		}
		for (int i = 0; i < s1.length(); i++) {
			if (h.get(s1.charAt(i)) != h2.get(s1.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "abcdaa";
		String s2 = "aadcb";
		System.out.print(check(s1, s2));

	}

}
