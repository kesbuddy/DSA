package stacks;

public class StackUse {

	public static void main(String[] args) throws StackEmptyException, StackFullException {
//		StackUsingArray stack = new StackUsingArray();
		StackUsingLL<Integer> stack = new StackUsingLL<>();
		int arr[] = {2,3,5,7,8,9};
		for(int i=0;i<arr.length;i++) {
			stack.push(arr[i]);
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		
//		stack.push(10);
////		stack.push(20);
//		System.out.println(stack.pop());
//		System.out.println(stack.top());
//		System.out.println(stack.isEmpty());
	}
}
