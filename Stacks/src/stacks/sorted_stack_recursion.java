package stacks;

import java.util.Stack;

public class sorted_stack_recursion {
	 public static void sortedInteger(Stack<Integer> stack,int top){
	     //base case   
		 if(stack.isEmpty() || (!stack.isEmpty() && top>stack.peek())){
	            stack.push(top);
	            return;
	        }
	           int num = stack.pop();
	           
	           //recursive call
	           sortedInteger(stack,num);
	           stack.push(num);
	    }
		public static void sortStack(Stack<Integer> stack) {
			if(stack.isEmpty()){
	           return; 
	        }
	        int top = stack.pop();
	        sortStack(stack);
	        sortedInteger(stack,top); 
		}

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(5);
		s.push(-2);
		s.push(9);
		s.push(-7);
		s.push(3);
		sortStack(s);
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

}
