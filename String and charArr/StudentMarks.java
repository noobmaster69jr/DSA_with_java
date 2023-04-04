import java.util.ArrayList;

/* you are given an array of String A representing students name & score in combined form for
  example "harsh95" represent harsh has 95 marks. You've to return another array of strings
  containing name & score sorted on basis of their marks, keys the first one from input array 
  in first position.
 */
// O(N^2 M) solution, where M is the length of the string
public class StudentMarks {

	public static void main(String[] args) {
		String[] A = { "harsh91", "ash99", "aravi89", "taman91" };
		ArrayList<String> new_arr = new ArrayList<>();
		int visited[] = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			int max = 0, index = -1;
			for (int j = 0; j < A.length; j++) {
				if (visited[j] == 0) {
					int k;
					for (k = 0; k < A[j].length(); k++) {
						if (A[j].charAt(k) >= '0' && A[j].charAt(k) <= '9') {
							break;
						}
					}
					int score = Integer.parseInt(A[j].substring(k));
					if (score > max) {
						max = score;
						index = j;
					}
				}
			}
			new_arr.add(A[index]);
			visited[index]++;
		}
		System.out.print(new_arr);
	}

}
