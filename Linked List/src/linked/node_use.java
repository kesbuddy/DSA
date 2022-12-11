package linked;

import java.util.Scanner;

public class node_use {
	
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
		print(head);
		
		
		//		node<Integer> node1 = new node<Integer>(10);
//		node<Integer> node2 = new node<Integer>(20);
//		node<Integer> node3 = new node<Integer>(30);
//		node1.next = node2;
//		node2.next = node3;
//		
//		node<Integer> head = node1;
//		while(head!=null) {
//			System.out.print(head.data+" ");
//			head = head.next;
//		}
//	}

}
}
