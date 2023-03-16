/*Given the value of N, i(position) and b(binary value). 
 * update the i'th bit in N to b.
 */
public class UpdateIthBit {
	static void update(int n, int i, int b) {
		int mask = ~(1 << i);
		n = n & mask;
		n = n | (b << i);
		System.out.print(n);
	}

	public static void main(String[] args) {
		int n = 13, i = 2, b = 0;
		update(n, i, b);
	}
}
