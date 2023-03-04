import java.util.ArrayList;
import java.util.Scanner;

/**
 * Given a matrix[m][n], print both the diagonals
 *
 */
public class Print2Diagonals {
	static void print(ArrayList<ArrayList<Integer>> arr, int M, int N) {
		int x = 0, y = 0;
		while (x < M && y < N) {
			System.out.print(arr.get(x).get(y) + " ");
			x++;
			y++;
		}
		System.out.println();
		int a = 0, b = N - 1;
		while (a < M && b >= 0) {
			System.out.print(arr.get(a).get(b) + " ");
			a++;
			b--;
		}
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
		print(arr, M, N);
		sc.close();
	}
}
