package linked;

import java.util.Scanner;

public class delete_a_node_recursion {
	
	public static node<Integer> delete(node<Integer> head,int pos){
		
		if(pos==0) {
			return head.next;  // when we reach at that pos (i.e. 0) we reach the no we want to delete so head.next!
		}
		
		if(head==null) {
			return head;
		}
		
		head.next = delete(head.next, pos-1);
		return head;
		
	}
		public static node<Integer> takeInput(){
		node<Integer> head = null;
		node<Integer> tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		while(data!=-1) {
			node<Integer> newNode = new node<Integer>(data);
			if(head==null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;  // OR tail = tail.next;
				
			}
			data = sc.nextInt();
			
		}
		return head;
		
	}
	
	public static void print(node<Integer>head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		node<Integer> head = takeInput();
		node<Integer> head2 = delete(head,0);
		print(head2);

	}

}
