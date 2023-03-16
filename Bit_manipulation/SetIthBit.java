/**
 * Given N, set i'th bit.
 */
public class SetIthBit {
	static int setBit(int n, int i) {
		int mask = 1 << i;
		return mask | n;
	}

	public static void main(String[] args) {
		int n = 7;
		int i = 4;
		System.out.print(setBit(n, i));
	}
}
