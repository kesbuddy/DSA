package queue;

public class QueueUsingLL<T> {
	private node<T> front;
	private node<T> rear;
	int size;
	
	public void QueueUsingArray() {
		front = null;
		rear = null;
		size=0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void enqueue(T elem) {
		node<T> newNode = new node<>(elem);
		size++;
		if(rear == null) { // or front == null .. basically first operation
			front = newNode;
			rear = newNode;
		}
		else {
			rear.next = newNode;  // connecting newNode to the rear node 
			rear = newNode;       // updating value of rear
		}
	}
	
	public T dequeue() throws QueueEmptyException {
		if(front == null) {  // we haven't written size==0 because while dequeing if we dequeue last element than front do becomes null but size is not zero !
			throw new QueueEmptyException();
		}
		T temp = front.data;
		front = front.next;
		if(front == null) { // if no element is remaining all had dequeued
			rear = null;
		}
		size--;
		return temp;
	}
	
	public T front() throws QueueEmptyException {
		if(front == null) {
			throw new QueueEmptyException();
		}
		return front.data;
	}
	

}
