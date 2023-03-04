/**
 * Given a square matrix [n][n] rotate it 90deg
 */
public class Rotate_90deg {
	static void transpose(int[][] arr, int r, int c) {

		for (int i = 0; i < r; i++) {
			for (int j = i + 1; j < c; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		// we can also reverse individual column
		for (int i = 0; i < r / 2; i++) {
			for (int j = 0; j < c; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[c - 1 - i][j];
				arr[c - 1 - i][j] = temp;
			}
		}
	}

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		transpose(arr, 5, 5);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
