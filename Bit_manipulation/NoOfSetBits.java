/**
 * Given a positive number find no of set bits in it.
 */
public class NoOfSetBits {
	public static void main(String[] args) {
		int n = 7;
		int count = 0;
		while (n != 0) {
			int last_bit = (n & 1);
			if (last_bit == 1) {
				count++;
			}
			n = n >> 1;
		}
		System.out.print(count);
	}
}
