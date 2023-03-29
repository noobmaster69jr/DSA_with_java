/* On the first row, we write a 0. now in every subsequent row, we look at the previous row
 * and replace each occurance of 0 with 01 and each occurance of 1 with 10
 * Given row number A and index B, return the B'th indexed Symbol in row A . The values of B are
 * 1-indexed.
 */
public class KthSymbol {
	static char valueOfB(int a, int b, String k) {
		if (a == 0) {
			return k.charAt(b - 1);
		}
		String str = "";
		for (int i = 0; i < k.length(); i++) {
			if (k.charAt(i) == '0') {
				str = str.concat("01");
			} else {
				str = str.concat("10");
			}
		}
		return valueOfB(a - 1, b, str);
	}

	public static void main(String[] args) {
		int a = 3, b = 5;
		System.out.println(valueOfB(a, b, "0"));
	}
}
