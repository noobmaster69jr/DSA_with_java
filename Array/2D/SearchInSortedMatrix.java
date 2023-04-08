/* Given 2D array which is sorted along the rows and columns and your are given an element x
 * to search in the array
 */
public class SearchInSortedMatrix {
	static void search(int[][] arr, int r, int c, int key) {
		int i = 0, j = r - 1;
		// Staircase search , O(N+M)
		while (i < r && j >= 0) {
			if (arr[i][j] == key) {
				System.out.print("Found at position " + i + " " + j);
				return;
			} else if (arr[i][j] > key) {
				j--;
			} else {
				i++;
			}
		}
		System.out.print("Not found");
	}

	public static void main(String[] args) {

		int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 35, 45 }, { 32, 33, 39, 50 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		search(arr, arr.length, arr[0].length, 27);

	}
}
