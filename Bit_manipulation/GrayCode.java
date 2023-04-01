import java.util.ArrayList;

/* The gray code is a binary numeral system where two successive values differ in only one
 * bit. Given a non-negative integer A representing the total number of bits in the code, 
 * print the sequence of gray code. A gray code sequence must begin with 0.
 */
public class GrayCode {
	public static void main(String[] args) {
		int A = 3;
		ArrayList<Integer> result = new ArrayList<>();
		result.add(0);
		result.add(1);
		for (int i = 2; i <= A; i++) {
			for (int j = result.size() - 1; j >= 0; j--) {
				result.add(result.get(j) + (1 << (i - 1)));
			}
		}
		System.out.print(result);
	}
}
