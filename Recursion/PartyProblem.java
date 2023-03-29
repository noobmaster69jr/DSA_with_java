/* N friends want to go to party, in each bike 1 person can sit  or two person. How many ways
 * they can go to the party
 */
public class PartyProblem {
	static int noOfWays(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		return noOfWays(n - 1) + (n - 1) * noOfWays(n - 2);
	}

	public static void main(String[] args) {
		int n = 3;
		System.out.print(noOfWays(n));
	}
}
