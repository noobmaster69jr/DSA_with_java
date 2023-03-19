/*Given a char arr[] toggle case of ever character in the array without using any
 * library function
 */
public class ToggleCharArray {
	static void toggle(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] += 32;
			} else {
				arr[i] -= 32;
			}
		}
	}

	public static void main(String[] args) {
		char[] arr = { 'a', 'z', 'R', 'c', 'F' };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		toggle(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
