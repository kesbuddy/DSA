package stacks;
import java.util.Stack;

public class Redundant_brackets {
	
	public static boolean findRedundantBrackets(String s) 
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='+' || ch=='*' || ch=='/'){
                stack.push(ch);
            }
            // if closing bracket found 
            else{
                if(ch==')'){
                    Boolean isRedundant = true;
                    while(stack.peek()!='('){
                        char top = stack.peek();
                        if(top=='(' || top=='+' || top=='*' || top=='/'){
                            isRedundant = false;
                        }
                        stack.pop();
                    }
//                    if(isRedundant = true){
//                        return true;
//                    }
                    stack.pop();
                }
            }
        }
//        if(isRedundant == true) {
//        	return true;
//        }
        return false;
    }

	public static void main(String[] args) {
		String s = "(a+b)";
		System.out.println(findRedundantBrackets(s));

	}

}
