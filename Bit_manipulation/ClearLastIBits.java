/*Given a No clear last I bits  */
public class ClearLastIBits {
	static void clear(int n, int i) {
		System.out.print(n >> i);
	}

	public static void main(String[] args) {
		int n = 13;
		int i = 2;
		clear(n, i);
	}
}
