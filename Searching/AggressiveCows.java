
public class AggressiveCows {
	static void searchSpace(int stalls[], int cows, int n) {
		int ans = 5;
		int s = 0;
		int e = stalls[n - 1] - stalls[0];
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (cowsCanFit(stalls, cows, mid)) {
				ans = mid;
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		System.out.print(ans);
	}

	static boolean cowsCanFit(int stalls[], int cows, int sep) {
		int lastStall = stalls[0];
		int cnt = 1;
		for (int i = 1; i < stalls.length; i++) {
			if (stalls[i] - lastStall >= sep) {
				cnt++;
				lastStall = stalls[i];
			}
			if (cnt == cows) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int stalls[] = { 1, 2, 4, 8, 9 };
		int cows = 3;
		searchSpace(stalls, cows, stalls.length);
	}
}
