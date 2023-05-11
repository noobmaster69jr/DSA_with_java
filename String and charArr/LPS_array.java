// LPS array using KMP algorithm
public class LPS_array {
	static void printArray(int lps[], String s) {
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
		for (int i = 0; i < s.length(); i++) {
			System.out.print(lps[i] + " ");
		}
	}

	public static void main(String args[]) {
		String s = "abayabay";
		int lps[] = new int[s.length()];
		printArray(lps, s);
	}
}
