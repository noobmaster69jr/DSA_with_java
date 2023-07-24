public class Permutation {

	static void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int count = 0;

	static void generatePermutation(int i, int[] arr) {
		if (i == arr.length) {
			for (int k = 0; k < arr.length; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();
			count++;
			return;
		}

		for (int j = i; j < arr.length; j++) {
			swap(i, j, arr);
			generatePermutation(i + 1, arr);
			swap(j, i, arr);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		generatePermutation(0, arr);
	}
}
