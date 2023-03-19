/*Given a char arr[] which contains only lowercase letters sort the given character array
 * approach 1 : bubble sort - O(N^2)
 * approach 2 : Array.sort  - O(N log N)
 * approach 3 : Counting sort
 */
public class SortCharArray {

	static void customSort(char[] arr) {
		int freq[] = new int[26];
		for (int i = 0; i < arr.length; i++) {
			freq[(arr[i] - 'a')]++;
		}
		int j = 0; // O(N + range)
		for (int i = 0; i < 26; i++) {
			while (freq[i] != 0) {
				arr[j] = (char) (i + 'a');
				j++;
				freq[i]--;
			}
		}
	}

	public static void main(String[] args) {
		char[] arr = { 'a', 'f', 'b', 'e', 'i', 'z', 'x' };
		customSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
