/*Given n elements, find a pair of elements that generates a maximum AND value */
public class MaxANDvalue {
	static int countPattern(int[] arr, int pattern) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & pattern) == pattern) {
				count++;
			}
		}
		return count;
	}

	static void maxValue(int[] arr) {
		int pattern = 0;
		for (int bit = 30; bit >= 0; bit--) {
			for (int i = 0; i < arr.length; i++) {
				int count = countPattern(arr, 1 << bit | pattern);
				if (count >= 2) {
					pattern = (1 << bit) | pattern;
				}
			}
		}
		System.out.print(pattern);
	}

	public static void main(String[] args) {
		int arr[] = { 16, 12, 8, 4 };
		maxValue(arr);
	}
}
