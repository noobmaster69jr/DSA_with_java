
public class SpiralMatrix {
	static void traversal(int[][] arr, int r, int c) {
		int top = 0, bottom = r - 1, left = 0, right = c - 1;
		while (top <= bottom && left <= right) {
			for (int i = left; i <= right; i++) {
				System.out.print(arr[top][i] + " ");
			}
			top++;
			for (int i = top; i <= bottom; i++) {
				System.out.print(arr[i][right] + " ");
			}
			right--;
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					System.out.print(arr[bottom][i] + " ");
				}
				bottom--;
			}
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					System.out.print(arr[i][left] + " ");
				}
				left++;
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
		traversal(arr, 5, 5);

	}
}
