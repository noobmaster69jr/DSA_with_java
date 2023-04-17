//Given an array check if there is subsequence with gcd = 1

public class SubseqWithGcdOne {

	static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		return gcd(b % a, a);
	}

	// WKT, if the array gcd is 1 , then such a subsequence with gcd = 1 will always
	// exist
	static boolean check(int arr[]) {
		int ans = gcd(arr[0], arr[1]);
		for (int i = 2; i < arr.length; i++) {
			if (ans == 1) {
				return true;
			}
			ans = gcd(ans, arr[i]);
		}
		if (ans == 1)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 12, 40, 13 };
		System.out.print(check(arr));

	}

}
