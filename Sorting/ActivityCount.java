import java.util.Arrays;
import java.util.Comparator;

class Activity {
	int start, end;

	Activity(int start, int end) {
		this.start = start;
		this.end = end;
	}

	int getEndTime() {
		return end;
	}
}

public class ActivityCount {

	static void count(Activity list[]) {
		Arrays.sort(list, Comparator.comparing(Activity::getEndTime));
		int count = 1;
		int endTime = list[0].end;
		for (int i = 1; i < list.length; i++) {
			if (list[i].start >= endTime) {
				count++;
				endTime = list[i].end;
			}
		}
		System.out.print(count);
	}

	public static void main(String[] args) {
		Activity list[] = new Activity[8];
		list[0] = new Activity(2, 8);
		list[1] = new Activity(1, 2);
		list[2] = new Activity(5, 8);
		list[3] = new Activity(3, 4);
		list[4] = new Activity(7, 9);
		list[5] = new Activity(10, 12);
		list[6] = new Activity(9, 11);
		list[7] = new Activity(1, 12);
		count(list);
	}

}
