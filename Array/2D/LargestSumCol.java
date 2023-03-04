import java.util.ArrayList;
import java.util.Scanner;

/**
 * Given matrix[M][N] find the column with largest sum
 */

public class LargestSumCol {
	static int colSum(ArrayList<ArrayList<Integer>> arr, int M, int N) {
		int index = 0;
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			int sum = 0;
			for (int j = 0; j < M; j++) {
				sum = sum + arr.get(j).get(i);
			}
			if (sum > largest) {
				largest = sum;
				index = i;
			}
		}
		return index + 1;
	}

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
		System.out.print(colSum(arr, M, N));
		sc.close();
	}
}
