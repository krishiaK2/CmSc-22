
public class StringStack {
	private String[] elements; //mao ni ang stack.
	private int count; //no of elements on the stack.
	public static final int DEFAULT_SIZE = 10; //maximum no of elements nga maigo sa stack.

	public void push(String item) {
		elements[count++] = item;
	}

	public String pop() {
		if (count <= 0) {
			throw new ArrayIndexOutOfBoundsException("No negative index!");
		}
		return elements[--count];
	}
	public int size() {
		return count;
	}
	public StringStack() {
		elements = new String[DEFAULT_SIZE];
	}
	public StringStack(int size) {
		if (size < 0) {
			throw new ArrayIndexOutOfBoundsException("That's a negative size!");
		}
		elements = new String[size];
	}
	public String toString() {
		if (count <= 0) {
			return "EMPTY";
		}
		String finalString = "";
		for (int i = 0; i < count - 1; i++) {
			finalString = finalString + elements[i] + ",";
		}
		finalString = finalString + elements[count - 1];
		return finalString;
	}
	public String peek() {
		return elements[0]; // ang top kay ang count-1, and ang bottom kay index 0.
	}
	public String pop(int n) {
		if (count <= 0) {
			throw new ArrayIndexOutOfBoundsException("No negative index!");
		} 
		else if (count < n) {
			throw new IllegalArgumentException("Input exceeds the number of elements!");
		}
		String result = "";
		for (int i = 0; i < n; i++) {
			result =pop();
		}
		return result;
	}

}