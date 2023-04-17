//Find the Lcm.
public class Lcm {

	static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		return gcd(b % a, a);
	}

	static int ComputeLcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

	public static void main(String[] args) {
		// WKT, Gcd * Lcm = a*b
		int a = 16, b = 24;
		System.out.print(ComputeLcm(a, b));
	}

}
