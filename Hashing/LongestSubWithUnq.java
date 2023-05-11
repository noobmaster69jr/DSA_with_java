import java.util.HashSet;

public class LongestSubWithUnq {
	static void window(String s) {
		int i = 0;
		int j = 0;
		int len = 0;
		HashSet<Character> h = new HashSet<>();
		while (j < s.length()) {
			if (!h.contains(s.charAt(j))) {
				h.add(s.charAt(j));
				j++;
			} else {
				while (h.contains(s.charAt(j))) {
					h.remove(s.charAt(i));
					i++;
				}
			}
			len = Math.max(h.size(), len);
		}
		System.out.print(len);
	}

	public static void main(String[] args) {
		String s = "abciabcdde";
		window(s);
	}

}
