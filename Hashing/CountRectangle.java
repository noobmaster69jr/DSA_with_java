
/*Given the list of points, 
write a program to count the number of rectangles which can be formed using the given points.*/
import java.util.ArrayList;
import java.util.HashSet;

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class CountRectangle {
	static String encode(int a, int b) {
		return a + "$" + b;
	}

	static void rectangle(ArrayList list) {
		int cnt = 0;
		int n = list.size();
		HashSet<String> h = new HashSet<>();
		for (int i = 0; i < n; i++) {
			Point som = (Point) list.get(i);
			h.add(encode(som.x, som.y));
		}
		System.out.println(h);
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				Point p1 = (Point) list.get(i);
				Point p2 = (Point) list.get(j);
				if (p1.x == p2.x || p1.y == p2.y)
					continue;
				String point1 = encode(p1.x, p2.y);
				String point2 = encode(p2.x, p1.y);
				if (h.contains(point1) && h.contains(point2)) {
					cnt++;
				}
			}
		}
		System.out.print(cnt / 2);
	}

	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList<>();

		list.add(new Point(-4, 3));
		list.add(new Point(-2, 1));
		list.add(new Point(-2, 2));
		list.add(new Point(-2, 5));
		list.add(new Point(-2, 6));
		list.add(new Point(0, 4));
		list.add(new Point(1, 2));
		list.add(new Point(3, 2));
		list.add(new Point(1, 5));
		list.add(new Point(3, 5));
		list.add(new Point(2, 0));
		list.add(new Point(4, 0));
		list.add(new Point(6, 3));
		list.add(new Point(2, -3));
		list.add(new Point(4, -3));
		list.add(new Point(0, 5));
		list.add(new Point(0, 2));
		rectangle(list);
	}

}
