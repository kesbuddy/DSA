package linked;

import java.util.Scanner;

public class insert_a_node {
	
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
	
	public static node<Integer> insert(node<Integer> head,int data,int pos){
		
		node<Integer> newNode = new node<Integer>(data);
		int i=0;
		node<Integer> temp = head;
		if(pos==0) {
			newNode.next = head;
			return newNode;
		}
		while(i<pos-1) {
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		return head;
	}

	public static void main(String[] args) {
		node<Integer> head = takeInput();
		head = insert(head, 80, 0);
		print(head);

	}

}
