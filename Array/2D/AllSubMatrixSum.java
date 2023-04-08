/*Given a matrix N*M, calculate the sum of all sub matrix */

public class AllSubMatrixSum {
	static void sum(int[][] arr, int n, int m) {
		int res = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				res += arr[i][j] * (i + 1) * (j + 1) * (n - i) * (m - j);
			}
		}
		System.out.print(res);
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		sum(arr, 3, 3);
	}
}
