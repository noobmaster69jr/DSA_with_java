
public class PowerOf {
	static int func(int a, int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return a;
		}
		return func(a, n / 2) * func(a, n / 2);
	}

	public static void main(String[] args) {
		int a = 3, n = 4;
		if (n % 2 == 0) {
			System.out.println(func(a, n));
		} else {
			System.out.println(a * func(a, n));
		}

	}

}
