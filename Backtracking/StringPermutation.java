import java.util.Arrays;

public class StringPermutation {

	static void swap(int i, int j, char[] ch) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

	static void generateAllPermutations(char[] ch, int i) {

		if (i == ch.length) {
			System.out.println(Arrays.toString(ch));
			return;
		}

		for (int j = i; j < ch.length; j++) {
			swap(i, j, ch);
			generateAllPermutations(ch, i + 1);
			swap(i, j, ch); // backtracking
		}
	}

	public static void main(String[] args) {
		String str = "ABC";
		char[] ch = str.toCharArray();

		generateAllPermutations(ch, 0);

	}
}
