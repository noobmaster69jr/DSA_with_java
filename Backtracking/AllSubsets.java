import java.util.ArrayDeque;

/* Given an array of integers of length N. generate all the subsets */

public class AllSubsets {

	static void generateSubset(Integer[] arr, int i, ArrayDeque<Integer> output) {

		if (i == arr.length) {
			System.out.println(output);
			return;
		}
		// not including the value at index
		generateSubset(arr, i + 1, new ArrayDeque<>(output));

		// including value at index
		output.add(arr[i]);
		generateSubset(arr, i + 1, new ArrayDeque<>(output));

	}

	public static void main(String[] args) {
		Integer arr[] = { 1, 2, 3 };
		ArrayDeque<Integer> output = new ArrayDeque<>();
		generateSubset(arr, 0, output);
	}
}
