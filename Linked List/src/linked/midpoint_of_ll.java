package linked;

import java.util.Scanner;

public class midpoint_of_ll {
	
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
	
	public static int mid(node<Integer> head) {

		node<Integer> slow = head;
		node<Integer> fast = head;
		while((fast.next!=null) && (fast.next.next!=null)) {
			slow = slow.next;
			fast = fast.next.next;
		}
		int data = slow.data;
		return data;
		
	}
	public static void main(String[] args) {
		node<Integer> head = takeInput();
		System.out.println(mid(head));
	}

}
