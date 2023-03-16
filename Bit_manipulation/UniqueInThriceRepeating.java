/*Given 3N+1 numbers every number is repeating thrice except one unique number.
 * find out the unique number. Find out the unique number.
 */
public class UniqueInThriceRepeating {
	static void unique(int[] arr, int n) {
		int sum, x, result = 0;
		for (int i = 0; i < 32; i++) {
			sum = 0;
			x = 1 << i;
			for (int j = 0; j < n; j++) {
				if ((arr[j] & x) != 0) {
					sum++;
				}

			}
			if (sum % 3 != 0) {
				result |= x;
			}
		}
		System.out.print(result);
	}

	public static void main(String[] args) {
		int arr[] = { 12, 1, 12, 3, 12, 1, 1, 2, 3, 2, 2, 3, 7 };
		int n = arr.length;
		unique(arr, n);

	}

}
