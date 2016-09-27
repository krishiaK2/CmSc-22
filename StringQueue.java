import java.util.*;

public class StringQueue {
	private String[] elements; //mao ni ang stack.
	private int count; //no of elements on the stack.
	public static final int DEFAULT_SIZE = 10; //maximum no of elements nga maigo sa stack.
	private int size;



	public int size() {
		return count;
	}
	public StringQueue() {
		size = DEFAULT_SIZE;
		elements = new String[size];
	}

	public void expand(){
		size = size * 2;
	    String[] copy = new String[size];
	    copy = Arrays.copyOf(elements, size);
	    elements = copy;
	}

	public void enqueue(String item) {
		if (count >= size) {
			expand();
		}
		elements[count++] = item;
	}

	public String dequeue() {
		if (count <= 0) {
			throw new ArrayIndexOutOfBoundsException("No negative index!");
		}
		String var = elements[0];
		for (int i = 0; i < count - 1; i++) {
			elements[i] = elements[i + 1];
		}
		count--;
		return var;
	}
	public String dequeue(int n) {
		if (count <= 0) {
			throw new ArrayIndexOutOfBoundsException("No negative index!");
		} 
		else if (count < n) {
			throw new IllegalArgumentException("Input exceeds the number of elements!");
		}
		String result = "";
		for (int i = 0; i < n; i++) {
			result = dequeue();
		}
		return result;
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
	public void singit(int n, String var) {
		if (count >= size) {
			expand();
		}
		if (n <= 0) {
			for (int i = 1; i < size; i++) {
				elements[i] = elements[i - 1];
			}
			elements[0] = var;
		} else if (n > count) {
			elements[n] = var;
		} else if (n > 0 && n < count) {
			for (int i = count; i > n - 1; i--) {
				// rem = elements[n + 1];
				elements[i] = elements[i - 1];
			}
			elements[n - 1] = var;
		}
		count++;
	}

}