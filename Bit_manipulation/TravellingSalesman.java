/* Given N cities, distance between pair of cities make a tour for salesman 
 * starting from 'A' and come back to 'A' by traveling all cities in min distance
 */
public class TravellingSalesman {

	static int minCost(int[][] path, int n, int currentCity, int visited) {
		if (visited == (1 << n) - 1) {
			return path[currentCity][0];
		}
		int cost = Integer.MAX_VALUE;
		for (int city = 0; city < n; city++) {
			if ((visited & (1 << city)) == 0) {
				int currentPathCost = path[currentCity][city] + minCost(path, n, city, visited | (1 << city));
				cost = Math.min(cost, currentPathCost);
			}
		}
		return cost;
	}

	public static void main(String[] args) {
		int path[][] = { { 0, 20, 42, 25 }, { 20, 0, 30, 34 }, { 42, 30, 0, 10 }, { 25, 34, 10, 0 } };
		int n = 4;
		System.out.print(minCost(path, n, 0, 1));
	}

}
