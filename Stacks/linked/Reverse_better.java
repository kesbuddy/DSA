package linked;

import java.util.Scanner;

public class Reverse_better {
	
	public static DoubleNode reverseBetter(node<Integer> head) {
		if(head==null || head.next==null) {
			DoubleNode ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		DoubleNode temp = reverseBetter(head.next);
		temp.tail.next = head;
		head.next = null;
		
		DoubleNode ans = new DoubleNode();
		ans.head = temp.head;
		ans.tail = head;
		return ans;
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
		node<Integer> head= takeInput();
		DoubleNode ans = reverseBetter(head);
		print(ans.head);

	}

}
