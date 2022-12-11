package linked;

import java.util.Scanner;

public class delete_a_node {
	
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
	
	public static node<Integer> delete(node<Integer>head,int pos){
		node<Integer> temp = head;
		int i=0;
		if(pos==0) {
			temp = temp.next;
			return temp;
		}
		while(i<pos-1) {
			temp = temp.next;
			i++;
		}
		temp.next = (temp.next).next; // i was writing temp = temp.next.next -->  should've been aware of this !!
		return head;
		
	}

	public static void main(String[] args) {
		node<Integer> head = takeInput();
		head = delete(head,3); // it means delete from third index as we have taken 1st element as 0th element
		print(head);
	}

}
