package queue;

public class QueueUsingArray {
	
    int size;
    int front;
    int rear;
	int[] data;
	
	public QueueUsingArray(int n) {
		data = new int[n];
		front = -1;
		rear = -1;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void enqueue(int elem){
		if(size==data.length) {
//			throw new QueueFullException();
			doubleCapacity();
		}
		
		if(size==0) {
			front = 0;
		}
//		if(size==data.length) { // making it circular queue
//			rear=0;
//		}
//		rear++;
		rear = (rear+1)%data.length;
		data[rear] = elem;
		size++;
	}
	
	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2*temp.length];
		int index = 0;
		for(int i = front; i<temp.length;i++) {
			data[index++] = temp[i];
		}
		for(int i = 0; i<=front-1;i++) {
			data[index++] = temp[i];
		}
		front = 0;
		rear = temp.length-1;
		
	}

	public int dequeue() throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}
		int temp = data[front];
		front++;
		size--;
		if(size==0) {
			front = -1;
			rear = -1;
		}
		return temp;
	}
	
	public int front() throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}
		return data[front];
	}
}
