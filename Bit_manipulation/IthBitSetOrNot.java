/**
 * Given a number, find its i'th bit set or not
 */
public class IthBitSetOrNot {
	static void setOrNot(int n, int i) {
		int mask = 1 << i;
		if ((n & mask) != 0) {
			System.out.print("Set Bit");
		} else {
			System.out.print("Not a set bit");
		}
	}

	public static void main(String[] args) {
		int n = 5;
		int i = 1;
		setOrNot(n, i);
	}
}
