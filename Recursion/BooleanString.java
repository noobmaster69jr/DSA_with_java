/* Given a int N, find no of ways to build Boolean Strings, with no consecutive one's */

public class BooleanString {
	static int noOfWays(int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 2;
		}
		return noOfWays(n - 1) + noOfWays(n - 2);
	}

	public static void main(String[] args) {
		int n = 3;
		System.out.println(noOfWays(n));
	}
}
