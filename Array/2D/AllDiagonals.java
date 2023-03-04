
/**Given a matrix [m][n] , print all of its diagonals
 * 
 */

import java.util.Scanner;

public class AllDiagonals {
	static void printDiagonals(int[][] arr, int m, int n) {

		for (int i = 0; i < n; i++) {
			int x = 0, y = i;
			while (x < m && y >= 0) {
				System.out.print(arr[x][y] + " ");
				x++;
				y--;
			}
			System.out.println();
		}
		for (int i = 1; i < m; i++) {
			int x = i, y = n - 1;
			while (x < m && y >= 0) {
				System.out.print(arr[x][y] + " ");
				x++;
				y--;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt();
		int arr[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		printDiagonals(arr, m, n);
		sc.close();

	}
}
