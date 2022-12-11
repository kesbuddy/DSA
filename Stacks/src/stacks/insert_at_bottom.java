
package stacks;

import java.util.Stack;

public class insert_at_bottom {
	
	public static Stack<Integer> insert(Stack<Integer> s, int x){
		if(s.size()==0) {
			s.push(x);
			return s;
		}
		int top = s.pop();
		insert(s, x);
		s.push(top);
		return s;
	}
	
	

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(7);
		s.push(1);
		s.push(4);
		s.push(5);
		Stack<Integer> s2 = insert(s, 3);
		while(!s2.isEmpty()) {
			System.out.println(s2.pop());
		}
	}

}
