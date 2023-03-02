//Given array of N integers. perform prefixSum only on even indices and skip odd indices

import java.util.Scanner;

public class PrefixSumEvenIndices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int prefixSum[] = new int[n];
		prefixSum[0] = arr[0];
		for (int i = 1; i < n; i++) {
			if (i % 2 == 0) {
				prefixSum[i] = prefixSum[i - 1] + arr[i];
			} else {
				prefixSum[i] = prefixSum[i - 1];
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(prefixSum[i] + " ");
		}
		sc.close();
	}
}
