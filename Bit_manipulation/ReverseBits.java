/* reverse bits of  32 bit unsigned int N*/
public class ReverseBits {

	static void reversal(int n) {
		long rev = 0;
		for (int i = 0; i < 32; i++) {
			rev = rev << 1;
			if ((n & 1) == 1) {
				rev ^= 1;
			}
			n = n >> 1;
		}
		System.out.print(rev);
	}

	public static void main(String[] args) {
		int n = 3;
		reversal(n);
	}

}
