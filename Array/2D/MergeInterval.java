import java.util.Arrays;
import java.util.Comparator;

class Interval {
	int start, end;

	Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

public class MergeInterval {
	public static void merge(Interval arr[]) {
		Arrays.sort(arr, new Comparator<Interval>() {
			@Override
			public int compare(Interval i1, Interval i2) {
				return i1.start - i2.start;
			}
		});

		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[index].end >= arr[i].start) {
				arr[index].end = Math.max(arr[index].end, arr[i].end);
			} else {
				index++;
				arr[index] = arr[i];
			}
		}

		for (int i = 0; i <= index; i++) {
			System.out.println(arr[i].start + " " + arr[i].end);
		}
	}

	public static void main(String[] args) {
		Interval arr[] = new Interval[4];
		arr[0] = new Interval(6, 8);
		arr[1] = new Interval(1, 9);
		arr[2] = new Interval(2, 4);
		arr[3] = new Interval(4, 7);
		merge(arr);

	}

}
