package linked;

import java.util.Scanner;

public class ith_node {
	
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
	
	public static int ithnode(node<Integer> head,int n) {
		int i=1;
		node<Integer> temp = head;
		while(i<n) {
			temp = temp.next;
			i++;
		}
		int data = temp.data;
		return data;
	}
	
	public static void main(String[] args) {
		node<Integer> head = takeInput();
		System.out.println(ithnode(head, 3));
	}

}
