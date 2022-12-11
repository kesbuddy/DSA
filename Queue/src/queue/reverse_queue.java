package queue;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class reverse_queue {
	
	public Queue<Integer> rev(Queue<Integer> q){
//		Stack<Integer> s = new Stack<>();
//        while(q.size()>1){
//            int temp = q.remove();
//            
//            s.push(temp);
//        }
//        while(!s.isEmpty()){
//            q.add(s.pop());
//        }
//        return q;
		if(q.size()==1) {
			return q; 
		}
		int temp = q.remove();
		rev(q);
		q.add(temp);
		return q;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
