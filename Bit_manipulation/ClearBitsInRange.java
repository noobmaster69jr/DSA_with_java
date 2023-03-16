
public class ClearBitsInRange {

	static void clear(int n, int i, int j) {
		int a = -1 << (i + 1);
		int b = 1 << (j - 1);
		int mask = a | b;
		System.out.print(n & mask);
	}

	public static void main(String[] args) {
		int n = 31, i = 3, j = 1;
		clear(n, i, j);
	}

}
