public class StringQueueTest {
	public static void main(String[] args) {
		StringQueue stack = new StringQueue();
		stack.enqueue("paper");
		stack.enqueue("plastic");
		stack.enqueue("tissue");
		System.out.println(stack);
		// System.out.println(stack.size());

		// String item1 = stack.dequeue(3);
		// // String item2 = stack.dequeue();
		// // String item3 = stack.dequeue();
		// System.out.println(item1);
		// System.out.println(item2);
		// System.out.println(item3);
		// System.out.println(stack);
		stack.singit(1, "haha");
		System.out.println(stack);
		// String item2 = stack.dequeue();
		// String item3 = stack.dequeue();
		// System.out.println(item1);
		// System.out.println(item2);
		// System.out.println(item3);
		// System.out.println(stack);
		// System.out.println(stack.size());
		// System.out.println("peek " + stack.peek());

	}
}