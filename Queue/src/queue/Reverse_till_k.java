package queue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class Reverse_till_k {
	
	public Queue<Integer> modifyQueue(Queue<Integer> q, int k){
		q.offerFirst();
	}

	public static void main(String[] args) {
		ArrayDeque<Integer> q = new ArrayDeque<>();
		q.offerFirst(2);

	}

}
