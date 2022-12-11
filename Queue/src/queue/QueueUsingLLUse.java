package queue;

public class QueueUsingLLUse {

	public static void main(String[] args) {
		QueueUsingLL<Integer> queue = new QueueUsingLL<>();
		int arr[] = {10,20,30,40,50};
		for(int elem: arr) {
			queue.enqueue(elem);
		}
		
		while(!queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				// never reach here because we will provide at least something to operate (size)
			}
		}
	}

}
