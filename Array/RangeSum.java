
/**
 * Given a array arr[] of N numbers. where N is number of overs bowled and arr[i] is number of runs
 * scored in the i'th over. Given number of Q queries , 
 * Find the number of runs scored in a range (L-R) for each Query.
 * 
 */

import java.util.Scanner;

public class RangeSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int prefixSum[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		prefixSum[0] = arr[0];
		for (int i = 1; i < n; i++) { // O(n)tc - O(n)sc
			prefixSum[i] = arr[i] + prefixSum[i - 1];
		}
		int Q = sc.nextInt();
		for (int i = 0; i < Q; i++) { // O(Q)
			int L = sc.nextInt(), R = sc.nextInt();
			if (L == 0) {
				System.out.println(prefixSum[R]);
			} else
				System.out.println(prefixSum[R] - prefixSum[L - 1]); // O(1)
		}
		sc.close();
		// we are using 2 independent loops overall time complexity - O(n+Q), space -
		// O(n)
	}

}
