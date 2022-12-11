package stacks;


public class StackUsingLL<T> {
	private node<T> head;
	private int size;
	
	public StackUsingLL() {
		head = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void push(T elem) {
		node<T> newNode = new node<T>(elem);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public T pop() throws StackEmptyException {
		if(size == 0) {
			throw new StackEmptyException();
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
	
	public T top() throws StackEmptyException {
		if(size == 0) {
			throw new StackEmptyException();
		}
		return head.data;
		
	}

}
