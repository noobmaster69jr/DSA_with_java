
/* Shivam has string A of size N containing only lowercase characters. He will update the 
 * string by inserting a number after every char which will be index of that char. Return
 * resulting string
 */
import java.util.Scanner;

public class CharIndex {

	static String resultingString(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			result = result + s.charAt(i) + (s.charAt(i) - 97 + 1);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(resultingString(s));
		sc.close();

	}

}
