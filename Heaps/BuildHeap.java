public class BuildHeap {
	int capacity;
	int size;
	int[] list;

	BuildHeap(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		list = new int[capacity + 1];
	}

	void add(int data) {
		if (size != capacity) {
			size++;
			list[size] = data;
			int idx = size;
			while (idx > 1 && list[idx / 2] < list[idx]) {
				int temp = list[idx];
				list[idx] = list[idx / 2];
				list[idx / 2] = temp;
				idx = idx / 2;
			}
		} else {
			System.out.println("heap is full, cannot insert " + data);
		}

	}

	void swap(int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}

	void removeMax() {
		swap(1, size);
		size--;
		int idx = 1;

		while (idx < size) {
			int leftChild = 2 * idx;
			int rightChild = 2 * idx + 1;
			int max = idx;
			if (leftChild <= size && list[idx] < list[idx * 2]) {
				max = idx * 2;
			}
			if (rightChild <= size && max < list[idx * 2 + 1]) {
				max = idx * 2 + 1;
			}
			if (max == idx) {
				break;
			}
			swap(idx, max);
			idx = max;
		}

	}

	boolean isEmpty() {
		return size == 0;
	}

	int getMax() {
		return list[1];
	}

	void print() {
		for (int i = 1; i <= size; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		BuildHeap h = new BuildHeap(5);
		String res = h.isEmpty() ? "heap is empty" : "heap is not empty";

		int arr[] = { 3, 5, 1, 7, 13 };
		for (int i : arr) {   // N log N
			h.add(i); // log N
		}

		h.print();
		h.removeMax();	// N log N
		h.print();
		h.removeMax();
		h.print();
		h.removeMax();
		h.print();
		h.removeMax();
		h.print();

	}

}
