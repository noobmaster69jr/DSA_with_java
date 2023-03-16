
public class PowerOf {
	public static void func(int a, int b) {
		int ans = 1;
		while (b != 0) {
			int last_bit = (b & 1);
			if (last_bit > 0)
				ans *= a;
			a *= a;
			b = b >> 1;
		}
		System.out.print(ans);
	}

	public static void main(String[] args) {
		int a = 2, b = 5;
		func(a, b);
	}
}
