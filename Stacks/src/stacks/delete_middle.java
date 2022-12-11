package stacks;
import java.util.Stack;
public class delete_middle {
	
		public static void solve(Stack<Integer> inputStack, int N, int count) {
	       
			if(count==N/2){
	            inputStack.pop();
	            return;
	        }
	        int x = inputStack.peek();
	        inputStack.pop();
	        solve(inputStack,N, count+1);
	        inputStack.push(x);
		}
	    
	    public static void deleteMiddle(Stack<Integer> inputStack, int N) {
			int count = 0;
	        solve(inputStack,N, count);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		deleteMiddle(s, 5);
		while(!s.isEmpty())
			System.out.println(s.pop());

	}

}
