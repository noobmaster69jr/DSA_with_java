/* Given a Floor of size N x 2. Tile is 2 x 1 or 1 x 2. Find no of ways to design the floor*/

public class TilingProblem {

	static int noOfWays(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		return noOfWays(n - 1) + noOfWays(n - 2);
	}

	public static void main(String[] args) {
		int n = 4;
		System.out.print(noOfWays(n));

	}

}
