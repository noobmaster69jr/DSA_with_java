import java.util.ArrayList;
import java.util.List;

public class SubsetPrinting {
	static void printFunc(int[] arr, int n) {
		for (int i = 0; i < (1 << n); i++) {
			List<Integer> l = new ArrayList<>();
			int index = 0, pos = i;
			while (pos > 0) {
				if ((pos & 1) == 1) {
					l.add(arr[index]);
				}
				pos = pos >> 1;
				index++;
			}
			System.out.println(l);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		printFunc(arr, arr.length);
	}

}
