//Given a pattern, count the no of occurrence of pattern in the text
public class cntPatterOcc {
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
		String text = "abcdabcabc";
		String pattern = "abc";
		int cnt = 0;
		int lps[] = lpsArray(pattern + "$" + text);
		int i;
		for (i = 0; i < lps.length; i++) {
			if (lps[i] == pattern.length()) {
				cnt++;
			}
		}
		System.out.print(cnt);
	}
}
