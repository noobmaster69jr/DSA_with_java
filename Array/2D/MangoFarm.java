
/** you went to a farm with 4 of your friends of size arr[n][n]
 * make 2 cuts in farm one horizontal and one vertical. you get 4 quadrants.
 * each friend will get one quadrant, sum of all mangoes in that quadrant.
 * friends are greedy so they take maximum mangoes quadrants and you always get the minimum.
 * optimize for maximum mangoes you can get.
 * approach 1: takes O(N^4) with no space , finding quadrant sum at every position
 * approach 2: we implement this here
 */

import java.util.Scanner;

public class MangoFarm {

	static int[][] prefixSum(int[][] arr, int n) {
		int parr[][] = new int[n][n];
		parr[0][0] = arr[0][0];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j == 0) {
					parr[i][j] = arr[i][j];
				} else if (i == 0) {
					parr[i][j] = arr[i][j] + parr[i][j - 1];
				} else if (j == 0) {
					parr[i][j] = arr[i][j] + parr[i - 1][j];
				} else {
					parr[i][j] = arr[i][j] + parr[i - 1][j] + parr[i][j - 1] - parr[i - 1][j - 1];
				}

			}
		}
		return parr;
	}

	static void optimize(int arr[][], int n) {
		int parr[][] = prefixSum(arr, n);
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) { // O(N^2) with additional space O(N^2)
			int q1, q2, q3, q4;
			for (int j = 0; j < n; j++) {
				q1 = parr[i][j];
				q2 = parr[i][n - 1] - q1;
				q3 = parr[n - 1][j] - q1;
				q4 = parr[n - 1][n - 1] - (q1 + q2 + q3);
				maxSum = Math.max(maxSum, Math.min(Math.min(q1, q2), Math.min(q3, q4)));
			}
		}
		System.out.print(maxSum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		optimize(arr, n);
		sc.close();
	}

}
