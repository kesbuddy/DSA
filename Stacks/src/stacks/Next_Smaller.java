package stacks;
import java.util.ArrayList;
import java.util.Stack;

public class Next_Smaller {
	
	public static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        ArrayList<Integer> list = new ArrayList<>(n);
        for(int i = n-1; i>=0 ; i--) {
        	int curr = arr.get(i);
        	while(s.peek()>=curr) {
        		s.pop();
        	}
        	// now ans is stack's peek element // 
//        	int ans = s.peek();
        	list.set(i, s.peek());
        	s.push(curr);
       }
        return list;
    
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(5);
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(3);
		int n = list.size();
//		ArrayList<Integer> l1 = nextSmallerElement(list, n);
//		for(int elem: l1) {
//			System.out.println(elem);
		System.out.println(list.get(3));
		}
	}

