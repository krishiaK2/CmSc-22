public class StringStackTester {
	public static void main(String[] args) {
		StringStack stack = new StringStack(20);
		stack.push("paper");
		stack.push("plastic");
		stack.push("tissue");
		System.out.println(stack);
		System.out.println(stack.size());

		String item1 = stack.pop(3);
		System.out.println(stack);

		// String item2 = stack.pop(2);
		// String item3 = stack.pop();
		// System.out.println(item1);
		// System.out.println(item2);
		// System.out.println(item3);
		// System.out.println(stack);
		// System.out.println(stack.size());
		System.out.println("peek " + stack.peek());

	}
}