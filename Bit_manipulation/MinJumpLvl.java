/*There is a enemy at N levels above the surface of the earth you are a superhero, standing
 * on earth (level 0) and you can take jumps in power of 2. Min jumps that would be 
 * needed to reach the enemy
 */

//we just need to find the no of set bits in n
public class MinJumpLvl {
	static int minJump(int n) {
		int count = 0;
		while (n != 0) {
			if ((n & 1) != 0) {
				count++;
			}
			n = n >> 1;
		}
		return count;
	}

	public static void main(String[] args) {
		int n = 15;
		System.out.print(minJump(n));
	}
}
