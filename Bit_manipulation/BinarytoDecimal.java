
public class BinarytoDecimal {
	static void conversion(int n) {
		int pos = 1;
		int ans = 0;
		while (n != 0) {
			int last_bit = n & 1;
			ans = ans + last_bit * pos;
			pos = pos << 1;
			n = n / 10;
		}
		System.out.print(ans);
	}

	public static void main(String[] args) {
		int n = 1011;
		conversion(n);

	}

}
