//Given a Text and pattern, check if the pattern exists in the text or not
public class patternExist {
	static int[] lpsArray(String s) {
		int lps[] = new int[s.length()];
		lps[0] = 0;
		for (int i = 1; i < s.length(); i++) {
			int x = lps[i - 1];
			while (s.charAt(i) != s.charAt(x)) {
				if (x == 0) {
					x = -1;
					break;
				}
				x = lps[x - 1];
			}
			lps[i] = x + 1;
		}
		return lps;
	}

	public static void main(String[] args) {
		String text = "abcbdac";
		String pattern = "cbd";

		int lps[] = lpsArray(pattern + "$" + text);
		int i;
		for (i = 0; i < lps.length; i++) {
			if (lps[i] == pattern.length()) {
				System.out.print("There exists a pattern");
				break;
			}
		}
		if (i == lps.length) {
			System.out.print("There does not exist a pattern");
		}
	}

}
