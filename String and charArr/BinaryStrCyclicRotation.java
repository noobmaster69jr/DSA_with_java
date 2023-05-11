//Given a binary string, find no of cyclic rotations which are same as original string
public class BinaryStrCyclicRotation {
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
		String bs = "1111";
		int cnt = 0;
		int lps[] = lpsArray(bs + "$" + bs + bs);
		int i;
		for (i = 0; i < lps.length; i++) {
			if (lps[i] == bs.length()) {
				cnt++;
			}
		}
		System.out.print(cnt - 1);
	}

}
