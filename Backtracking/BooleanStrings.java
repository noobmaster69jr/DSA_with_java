/* Given len N, print all boolean strings (0 & 1) of len N. */

import java.util.Arrays;

public class BooleanStrings {
	static void printAll(int i, int[] output) {
		if (i == output.length) {
			System.out.println(Arrays.toString(output));
			return;
		}
					// TC = O(2^N) , Sp = O(N)
		output[i] = 0;
		printAll(i + 1, output);
		output[i] = 1;    
		printAll(i + 1, output);
	}

	public static void main(String[] args) {
		int N = 3;
		int output[] = new int[N];
		printAll(0, output);
	}
}
