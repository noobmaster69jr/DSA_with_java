/**
 * Given N numbers find no of numbers which have atleast 1 number greater than
 * itself approach 1 : use nested for loops and traverse through the array for
 * each elements N^2 approach 2: sort the array and perform linear/binary search
 * to find the first occurance of the last element NlogN+N / NlogN+logN approach
 * 3: find the largest no and its count ( N - count). O(N)
 */

public class Atleast1Greatest {

	public static void main(String[] args) {
		int[] arr = { -3, 2, 8, 7, 1, 3, -2, 10, 10, 4, 4, 4, 6, 10, 4 };
		int largest = arr[0], count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest)
				largest = arr[i];
			else if (arr[i] == largest)
				count++;
		}
		System.out.print(arr.length - count);

	}

}
