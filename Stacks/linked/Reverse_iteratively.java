package linked;

import java.util.Scanner;

public class Reverse_iteratively {
	
	public static node<Integer> reverseIT(node<Integer> head){
		node<Integer> curr = head;
		node<Integer> prev = null;
		node<Integer> temp;
		while(curr!=null) {
			temp = curr.next;  // storing next element as later forward link is breakin up and becoming backward !
			curr.next = prev;  // making link backwards as we're reversing
			curr = temp;
		}
		return prev;
		
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
		node<Integer> head2 = reverseIT(head);
		print(head2);

	}

}
