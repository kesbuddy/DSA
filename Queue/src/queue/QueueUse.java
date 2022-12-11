package queue;

public class QueueUse {

	public static void main(String[] args){
		QueueUsingArray q = new QueueUsingArray(3);
		int arr[] = {10,20,30,40,50,70,80};
		for(int elem:arr) {
				q.enqueue(elem);
		while(!q.isEmpty()) {
			try {
				System.out.println(q.dequeue());
			} catch (QueueEmptyException e) {
				// never gonna reach here
			}
		}
//		System.out.println(q.front());

	}

}
}
