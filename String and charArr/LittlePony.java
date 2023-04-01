/* Given a string A consisting only of lowercase chars you ca swap any 2 characters of
 *  String A any number of times. Return 1 if it is possible to convert the String A to a
 *  palindromic String
 */

import java.util.Scanner;

public class LittlePony {

	static int checkPalindromic(String s) {
		int freqArr[] = new int[26];
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			freqArr[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < 26; i++) {
			if (freqArr[i] % 2 == 1) {
				count++;
			}
		}
		if (count <= 1) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(checkPalindromic(s));
		sc.close();
	}

}
