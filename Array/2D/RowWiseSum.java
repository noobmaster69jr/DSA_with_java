
/**
 * Given a matrix[m][n], print row wise sum
 */

import java.util.ArrayList;
import java.util.Scanner;

public class RowWiseSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>(M);
		for (int i = 0; i < M; i++) {
			arr.add(new ArrayList<Integer>(N));
			for (int j = 0; j < N; j++) {
				arr.get(i).add(sc.nextInt());
			}
		}
		for (int i = 0; i < M; i++) {
			int sum = 0;
			for (int j = 0; j < N; j++) {
				sum += arr.get(i).get(j);
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
