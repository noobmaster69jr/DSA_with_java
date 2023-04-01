
public class Stack {
	int arr[];
	int cap;
	int top;

	Stack(int x) {
		top = -1;
		cap = x;
		arr = new int[cap];
	}

	void push(int x) {
		if (cap - 1 == top) {
			System.out.println("Stack is full");
			return;
		}
		top++;
		arr[top] = x;
	}

	int pop() {
		if (top != -1) {
			int res = arr[top];
			top--;
			return res;
		} else {
			System.out.print("stack empty");
			return -1;
		}
	}

	boolean isEmpty() {
		return top == -1;
	}

	int size() {
		return (top + 1);
	}

	int peek() {
		if (!(top == -1))
			return arr[top];
		else
			return -1;
	}
}

class Stack_with_array {
	public static void main(String[] args) {
		Stack s = new Stack(10);
		s.push(10);
		s.push(48);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());

	}
}
