/*Given a string/char[] reverse it word by word
 * 
 */
public class ReverseWordsInString {
	static void swap(char[] arr, int low, int high) {
		char temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
	}

	static void reverse(char[] c, int low, int high) {
		while (low <= high) {
			swap(c, low++, high--);
		}
	}

	public static void reverse_word(char[] ch) {
		int start = 0;
		reverse(ch, 0, ch.length - 1);
		for (int end = 0; end < ch.length; end++) {
			if (ch[end] == ' ') {
				reverse(ch, start, end - 1); // O(N) tc - no space
				start = end + 1;
			}
		}
		reverse(ch, start, ch.length - 1);
	}

	public static void main(String[] args) {
		String s = "hello im nooob ";
		char[] ch = s.toCharArray();
		reverse_word(ch);
		String str = new String(ch);
		System.out.print(str);
	}
}
