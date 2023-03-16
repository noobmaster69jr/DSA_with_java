
public class DecimalToBinary {

	static void conversion(int n) {
		int ans = 0;
		int pos = 1;
		while (n != 0) {
			int rem = n % 2;
			ans = ans + rem * pos;
			pos = pos * 10;
			n = n / 2;
		}
		System.out.print(ans);
	}

	public static void main(String[] args) {
		int n = 11;
		conversion(n);
	}
}
