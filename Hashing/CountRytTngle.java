
/*Count of Right-Angled Triangle formed from given N points whose base are perpendicular or
 * parallel to X or Y axis
 *
 */
import java.util.HashMap;

public class CountRytTngle {

	static void rightAngled(int arr[][], int n) {
		int ans = 0;
		HashMap<Integer, Integer> x = new HashMap<>();
		HashMap<Integer, Integer> y = new HashMap<>();
		for (int i = 0; i < n; i++) {
			x.put(arr[i][0], x.getOrDefault(arr[i][0], 0) + 1);
			y.put(arr[i][1], y.getOrDefault(arr[i][1], 0) + 1);
		}
		for (int i = 0; i < n; i++) {
			if (x.get(arr[i][0]) >= 1 && y.get(arr[i][1]) >= 1) {
				ans += (x.get(arr[i][0]) - 1) * (y.get(arr[i][1]) - 1);
			}
		}
		System.out.print(ans);
	}

	public static void main(String[] args) {
		int arr[][] = { { 2, 2 }, { 2, 4 }, { 2, 6 }, { 5, 2 }, { 3, 2 }, { 7, 2 } };
		rightAngled(arr, 6);

	}

}
