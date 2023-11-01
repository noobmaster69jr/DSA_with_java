
public class HeapSort { // heapsort complexity is N log N
	
	//given an array, we can build heap using below approach - O(N)
	public static void makeHeapOrder(int[] arr) {
		int size = arr.length;
		for(int i = size/2-1; i >= 0 ;i--) {
			heapify(arr, i, size);
		}
	}
	
	static void heapify(int[] arr, int idx,int size) {
		
		while(idx < size) {
			int left = idx*2+1;
			int right = idx*2+2;
			int max = idx;
			if(left <= size && arr[idx] < arr[left] ) {
			max = left;
			}
			if(right <= size && arr[max] < arr[right]) {
				max = right;
			}
			if(max == idx) {
				break;
			}
			swap(arr, idx, max);
			idx = max;
		}
		
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void print(int[] arr) {
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {5, 2, 1, 8, 9};
		int size = arr.length-1;
		makeHeapOrder(arr);
			print(arr);
		for(int i = 0; i < arr.length; i++){  // N log N
		    swap(arr, 0, size);
		    size= size-1;
		    heapify(arr, 0, size);
		}
		print(arr);
	}

}
