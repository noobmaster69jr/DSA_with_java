
public class PalindromeArr {

	static boolean isPalindrome(int[] arr, int start, int end) {
		if (start > end) {
			return true;
		}
		return arr[start] == arr[end] && isPalindrome(arr, start + 1, end - 1);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 1 };
		System.out.print(isPalindrome(arr, 0, arr.length - 1));

	}

}
