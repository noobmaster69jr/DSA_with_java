//computing Gcd using Euclid's algorithm

public class Gcd {
	static int compute(int a, int b) {
		if (a == 0) {
			return b;
		}
		return compute(b % a, a);
	}

	public static void main(String[] args) {
		int a = 120, b = 100;
		System.out.print(compute(a, b));
	}

}
