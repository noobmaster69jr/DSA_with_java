
public class CharsNeeded {
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

	static String reverse(String s) {
		char arr[] = s.toCharArray();
		s = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			s += arr[i];
		}
		return s;
	}

	public static void main(String[] args) {
		String s = "abacdc";
		int max = 0;
		int lps[] = lpsArray(s + reverse(s));
		int i;
		for (i = 0; i < lps.length; i++) {
			max = Math.max(max, lps[i]);
		}
		System.out.print(s.length() - max);
	}

}
