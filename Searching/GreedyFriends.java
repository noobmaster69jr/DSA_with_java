/*There are N stacks of coins, each stack has certain value of coins.
 * The stacks are lying on a straight line, you have k friends with who you can divide the 
 * stacks in k+1 partitions. your friends are greedy and they will pick the best k parts and 
 * you will get the left one. Maximize the value of coins you can get.
 */
public class GreedyFriends {
	static void searchSpace(int arr[], int k) {
		int s = 0;
		int e = 0, ans = 0;
		for (int i = 0; i < arr.length; i++) {
			e += arr[i];
		}
		while (s <= e) {
			int mid = (s + e) / 2;
			if (canMaximize(arr, k, mid)) {
				ans = mid;
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		System.out.print(ans);
	}

	static boolean canMaximize(int[] arr, int k, int sep) {
		int money = 0;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			money += arr[i];
			if (money >= sep) {
				cnt++;
				money = 0;
			}
		}
		if (cnt >= k)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 15, 5, 8, 5 };
		int k = 3;
		searchSpace(arr, k);
	}

}
