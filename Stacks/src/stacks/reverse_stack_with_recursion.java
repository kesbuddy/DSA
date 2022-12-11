package stacks;

import java.util.Stack;

public class reverse_stack_with_recursion {
	
	public static void pushAtBottom(Stack <Integer> stack, int x) 
	  {
	    if(stack.isEmpty()) {
				stack.push(x);
				return;
			}
			int top = stack.pop();
			pushAtBottom(stack, x);
			stack.push(top);
		}
	    
	    public static void reverseStack(Stack<Integer> stack) {
			if(stack.isEmpty()){
	            return;
	        }        
	        int top = stack.pop();
	        reverseStack(stack);
	        pushAtBottom(stack,top);
		}

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(3);
		s.push(4);
		s.push(1);
		s.push(5);
		s.push(7);
		reverseStack(s);
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		

	}

}
