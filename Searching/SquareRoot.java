
public class SquareRoot {
	static int findValue(int no) {
		int s = 0, e = no, ans = 0;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (mid * mid < no) {
				ans = mid;
				s = mid + 1;
			} else if (mid * mid == no)
				return mid;
			else {
				e = mid - 1;
			}
		}
		return ans;
	}

	static void sqrtFunc(int no, int pre) {
		double ans = findValue(no);
		double inc = 0.1;
		while (pre > 0) {
			while (ans * ans <= no) {
				ans += inc;
			}
			ans -= inc;
			inc = inc / 10;
			pre--;
		}
		System.out.printf("%.3f", ans);

	}

	public static void main(String[] args) {
		int no = 98, pre = 3;
		sqrtFunc(no, pre);
	}
}
