package stacks;

import java.util.Stack;

public class valid_paranthesis {
	
	public static boolean valid(String str) {
		Stack<Character> s = new Stack<>();
		for(int i = 0; i<str.length();i++) {
			//for opening bracket
			char ch = str.charAt(i);
			if(ch == '[' || ch == '(' || ch == '{') {
				s.push(str.charAt(i));
			}
			// for closing bracket
			else {
				if(!s.isEmpty()) {
					char top = s.peek();
					if(( top =='(' && ch == ')') || ( top =='{' && ch == '}') || ( top =='[' && ch == ']')){
						s.pop();
					}
					else {
						return false;
					}
			}
				else {
					return false;
				}
		}	
	}
		if(s.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		String str= "[({})]";
		System.out.println(valid(str));
	}

}
