package stacks;

import java.util.Stack;

public class traial {
	public static Stack<Integer> tryy(Stack<Integer> s){
		return s;
	}

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		Stack<Integer> s2 = tryy(s);
		System.out.println(s2.pop());
	}

}
