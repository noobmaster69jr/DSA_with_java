/*Given the value of N and i(position). toggle the ith bit.
 */
public class ToggleIthBit {
	static void toggle(int n, int i) {
		int mask = 1 << i;
		System.out.print(n ^ mask);
	}

	public static void main(String[] args) {
		int n = 7;
		int i = 1;
		toggle(n, i);
	}
}
