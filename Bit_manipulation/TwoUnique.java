/*Given 2N+2 numbers where every no is coming twice except 2 unique no.
 * find the 2 unique no.
 */
public class TwoUnique {

	static void unique(int[] arr) {
		int n = arr.length;
		int res = 0;
		int a = 0, b = 0;
		for (int i = 0; i < n; i++) {
			res ^= arr[i];
		}
		int pos = 0;
		while (res != 0) {
			pos++;
			if ((res & 1) == 1) {
				break;
			}
			res = res >> 1;
		}
		for (int i = 0; i < n; i++) {
			if ((arr[i] & (1 << (pos - 1))) == 1) {
				a ^= arr[i];
			} else {
				b ^= arr[i];
			}
		}
		System.out.print(a + " " + b);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 3, 1, 2, 7 };
		unique(arr);

	}

}
