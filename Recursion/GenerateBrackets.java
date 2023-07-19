/* Given a integer n , generate legit string  brackets*/

public class GenerateBrackets {
	static void generateBracketsFunc(String s, int open, int close, int n) {
		if (s.length() == n * 2) {
			System.out.println(s);
			return;
		}

		if (open < n) {
			generateBracketsFunc(s + "(", open + 1, close, n);
		}

		if (close < open) {
			generateBracketsFunc(s + ")", open, close + 1, n);
		}
	}

	public static void main(String[] args) {
		int n = 3;
		generateBracketsFunc("", 0, 0, n);

	}
}
