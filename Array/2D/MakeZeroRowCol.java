import java.util.HashSet;

/*Given a 2D array contain no's some  elements are 0. if you see 0, make all elements in that
 * row & column as 0.
 */
public class MakeZeroRowCol {

	static void setZero(int arr[][], int n, int m) {
		HashSet<Integer> r = new HashSet<>();
		HashSet<Integer> c = new HashSet<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 0) {
					r.add(i);
					c.add(j);
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (r.contains(i) || c.contains(j)) {
					arr[i][j] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 0, 5 }, { 8, 7, 6 } };
		int n = 3, m = 3;
		setZero(arr, n, m);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
