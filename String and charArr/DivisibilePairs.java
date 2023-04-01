
public class DivisibilePairs {
	static void isDivisible(String[] A, int B) {
		int count = 0;
		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A.length; j++) {
				if (i != j) {
					String sum = A[i] + A[j];
					int rem = 0;
					for (int k = 0; k < sum.length(); k++) {
						rem = (rem + (sum.charAt(k) - '0')) % B;
						rem *= 10;
					}
					if (rem == 0) {
						count++;
					}
				}
			}
		}
		System.out.print(count);
	}

	public static void main(String args[]) {
		String A[] = { "12", "7", "53", "9", "14" };
		int B = 3;
		isDivisible(A, B);
	}
}
