/* Given a matrix of size N*M, and we are given Q queries. find the sum of the given submatrix.
 * Each query will have 4 integers x1, y1, x2, y2 denoting the sub matrix
 */
public class SubMatrixSum {

	static void preProcess(int arr[][], int pre_Arr[][], int N, int M) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (i == 0 && j == 0) {
					pre_Arr[i][j] = arr[i][j];
				} else {
					if (i == 0) {
						pre_Arr[i][j] = pre_Arr[i][j - 1] + arr[i][j];
					} else if (j == 0) {
						pre_Arr[i][j] = pre_Arr[i - 1][j] + arr[i][j];
					} else {
						pre_Arr[i][j] = pre_Arr[i - 1][j] + pre_Arr[i][j - 1] - pre_Arr[i - 1][j - 1] + arr[i][j];
					}
				}

			}
		}
	}

	static void printSum(int[][] arr, int N, int M, int x1, int y1, int x2, int y2) {
		int pre_Arr[][] = new int[N][M];
		preProcess(arr, pre_Arr, N, M);
		int sum = pre_Arr[x2][y2] - pre_Arr[x1 - 1][y2] - pre_Arr[x2][y1 - 1] + pre_Arr[x1 - 1][y1 - 1];

		System.out.print(sum);
	}

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4, 6 }, { 4, 6, 7, 5, 5 }, { 2, 4, 8, 9, 4 }, { 5, 3, 8, 1, 2 }, };

		int x1 = 1, y1 = 2, x2 = 2, y2 = 4;
		printSum(arr, 4, 5, x1, y1, x2, y2);

	}

}
