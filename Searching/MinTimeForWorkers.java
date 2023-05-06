/* Given N task, K workers and time to finish each task.
 * Condition: Each worker will execute a set of continuous task
 * All workers start doing tasks at some point
 * Find minimum time required to finsh al the tasks
 */
public class MinTimeForWorkers {
	static void searchSpace(int arr[], int k) {
		int s = 0;
		int e = 0;
		for (int i = 0; i < arr.length; i++) {
			e += arr[i];
		}
		int ans = 0;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (canFinishWork(arr, k, mid)) {
				ans = mid;
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		System.out.print(ans);
	}

	static boolean canFinishWork(int arr[], int k, int sep) {
		int cnt = 1;
		int work = 0;
		for (int i = 0; i < arr.length; i++) {
			work += arr[i];
			if (work > sep) {
				cnt++;
				work = arr[i];
				if (cnt > k)
					return false;
			}
		}
		if (cnt <= k) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 5, 7, 6, 2, 10 };
		int k = 3;
		searchSpace(arr, k);
	}
}
