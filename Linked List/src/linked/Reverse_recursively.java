package linked;

import java.util.Scanner;

public class Reverse_recursively {
	
	public static node<Integer> reverseR(node<Integer> head){
		if(head.next==null || head==null) {
			return head;
		}
		node<Integer> finalHead = reverseR(head.next);
		node<Integer> temp = finalHead;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = head;
		head.next = null;
		return finalHead;
		
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
		node<Integer> head2 = reverseR(head);
		print(head2);

	}

}
