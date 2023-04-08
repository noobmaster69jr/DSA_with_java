
public class XorPair {

	static void sum(int arr[]) {
		int sum = 0, significance = 1;
		for (int bit = 0; bit <= 30; bit++) {
			int one = 0, zero = 0;
			for (int i = 0; i < arr.length; i++) {
				if ((arr[i] & (1 << bit)) > 0) {
					one++;
				} else
					zero++;
			}
			sum += one * zero * significance;
			significance <<= 1;
		}
		System.out.print(sum);

	}

	public static void main(String[] args) {
		int arr[] = { 7, 5, 3 };
		sum(arr);

	}

}
