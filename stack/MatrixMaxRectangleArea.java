
/*Given a 2D matrix of 0's and 1's find out max rectangle area which contains all 1's.
 * Brute force = find x1, x2, y1, y2 (takes O(n^4)) and checking for 1's (takes O(n^2))
 * in total brute force takes  O(n^6)
 * 
 * optimized solution will be a extension of histogram problem - O(N^2)
 * */

public class MatrixMaxRectangleArea {
	static int[][] columnWiseSum(int[][] arr) {

		int prefix[][] = new int[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[0].length; j++) {
				if (i == 0) {
					prefix[i][j] = arr[i][j];
				} else {
					sum = prefix[i - 1][j];
					if (arr[i][j] == 0) {
						sum = 0;
					} else {
						sum += arr[i][j];
					}
					prefix[i][j] = sum;
				}
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 1, 0, 1, 0, 1 }, { 0, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 0 }, { 1, 0, 1, 0, 0, 1 },
				{ 1, 1, 0, 0, 1, 1 }, };

		int prefixSum[][] = columnWiseSum(arr);
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			// solution is a static method so we can directly access with class Name
			max = Math.max(max, Histogram.solution(prefixSum[i]));

		}
		System.out.print(max);
	}
}
