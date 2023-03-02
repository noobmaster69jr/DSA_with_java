/**
 * Given a sorted N array and sum , find if two numbers in the array add up to
 * sum
 * 
 * approach 1: N^2 nested for loop and find pair for each element
 *
 * approach 2: 2 pointer technique O(N)
 *
 * we can also hashing here, hashing is also effective incase of unsorted array
 */
public class PairSum {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 7, 9, 10, 13, 15 };
		int s = 0, e = arr.length - 1;
		int sum = 15;
		while (s < e) {
			int pair = arr[s] + arr[e];
			if (pair > sum) {
				e--;
			} else if (pair < sum) {
				s++;
			} else {
				System.out.print(arr[s] + " " + arr[e]);
				break;
			}
		}
	}
}
