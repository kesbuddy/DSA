package stacks;

import java.util.Stack;

public class reverse_stack_with_helper_stack {
	
	public static void reverseStack(Stack<Integer> stack1,Stack<Integer>stack2) {
		int x = stack1.pop();
		if(stack1.size()<=1) {
			return;
		}
		stack1.pop();
		reverseStack(stack1, stack2);
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		stack1.push(x);
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		while(!stack1.isEmpty()) {
			System.out.println(stack1.pop());
		}
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		reverseStack(stack1, stack2);
	}
}
