/* Given a String calculate the largest palindromic substring *
 *  approach 1 : O(N^3) - traverse through array, find substring, find if it is palindrome
 *  approach 2 : O(N^2) - consider every idx as the middle of palindromic string, find len
 */

public class LargPalindromeSubStr {
	static int subString(String str, int p1, int p2) {
		while (p1 >= 0 && p2 < str.length() && str.charAt(p1) == str.charAt(p2)) {
			p1--;
			p2++;
		}
		return p2 - p1 - 1;
	}

	public static void main(String[] args) {
		String str = "abba";
		int res = 0;
		if (str.length() % 2 == 0) {
			for (int i = 0; i < str.length(); i++) {
				res = Math.max(res, subString(str, i, i + 1));
			}
		} else {
			for (int i = 0; i < str.length(); i++) {
				res = Math.max(res, subString(str, i, i));
			}
		}

		System.out.print(res);
	}

}
