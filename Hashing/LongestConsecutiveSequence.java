
/*Given a list of N numbers which is unordered, 
 * find out the largest chain consecutive elements we can build*/
import java.util.HashSet;

public class LongestConsecutiveSequence {
	public static void consecutive(int[] arr) {
		HashSet<Integer> h = new HashSet<>();
		int res = 1;
		for (int i = 0; i < arr.length; i++) {
			h.add(arr[i]);
		}
		for (int x : arr) {
			int count = 1;
			if (!h.contains(x - 1)) {
				while (h.contains(x + count)) {
					count++;
				}
			}
			res = Math.max(res, count);
		}
		System.out.print(res);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 3, 5, 3, 2, 9, 10 };
		consecutive(arr);
	}
}
//int curr, res = 1;
//HashSet<Integer> S = new HashSet<Integer>();
//for (int i = 0; i < arr.length; i++)
//	S.add(arr[i]);
//for (Integer i : S) {
//	curr = 1;
//	if (!S.contains(i - 1)) {
//		while (S.contains(i + curr)) {
//			curr++;
//		}
//	}
//	res = Math.max(res, curr);
//}
//System.out.print(res);