package stacks;

public class StackUsingArray {
	
	private int data[];
	private int topIndex;
	
	public StackUsingArray() {
		topIndex = -1;
		data = new int[2];
	}
	public StackUsingArray(int size) {
		data = new int[size];
		topIndex = -1;
	}
	public boolean isEmpty() {
		if(topIndex == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	public int size() {
		return topIndex+1;
	}
	public void push(int elem) throws StackFullException {
		if(topIndex == data.length-1) {
			doubleCapatcity();
//			throw new StackFullException();
		}
		data[++topIndex] = elem;
	}
	
	private void doubleCapatcity() {
		System.out.println("doubling capacity...");
		int temp[] = data;
		data = new int[2*temp.length];
		for(int i=0;i<temp.length;i++) {
			data[i] = temp[i];
		}
	}
	public int top() throws StackEmptyException {
		if(topIndex == -1) {
			throw new StackEmptyException();
		}
		return data[topIndex];
    }
	public int pop() throws StackEmptyException {
		if(topIndex == -1) {
			throw new StackEmptyException();
		}
		int temp = data[topIndex];
		topIndex--;
		return temp;
	}
	

}
