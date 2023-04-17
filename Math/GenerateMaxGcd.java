
public class GenerateMaxGcd {

	static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		return gcd(b % a, a);
	}

	static void prefix(int arr[], int prefixArr[]) {
		prefixArr[0] = gcd(arr[0], 0);
		for (int i = 1; i < arr.length; i++) {
			prefixArr[i] = gcd(prefixArr[i - 1], arr[i]);
		}
	}

	static void suffix(int arr[], int suffixArr[]) {
		suffixArr[arr.length - 1] = gcd(arr[arr.length - 1], 0);
		for (int i = arr.length - 2; i >= 0; i--) {
			suffixArr[i] = gcd(suffixArr[i + 1], arr[i]);
		}
	}

	static void maxGcd(int[] arr) {
		int prefixArr[] = new int[arr.length];
		prefix(arr, prefixArr);
		int suffixArr[] = new int[arr.length];
		suffix(arr, suffixArr);
		int max_ans = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int current = 0;
			if (i == 0) {
				current = suffixArr[i + 1];
			} else if (i == arr.length - 1) {
				current = prefixArr[i - 1];
			} else {
				current = gcd(prefixArr[i - 1], suffixArr[i + 1]);
			}
			max_ans = Math.max(max_ans, current);
		}
		System.out.print(max_ans);
	}

	public static void main(String[] args) {
		int arr[] = { 14, 17, 28, 70 };
		maxGcd(arr);

	}

}
