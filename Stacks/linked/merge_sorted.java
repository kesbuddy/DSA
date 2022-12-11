package linked;

import java.util.Scanner;

public class merge_sorted {
	
	public static node<Integer> takeInput1(){
		node<Integer> head1 = null;
		node<Integer> tail1 = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		while(data!=-1) {
			node<Integer> newNode = new node<Integer>(data);
			if(head1==null) {
				head1 = newNode;
				tail1 = newNode;
			}
			else {
				tail1.next = newNode;
				tail1 = newNode;  // OR tail = tail.next;
				
			}
			data = sc.nextInt();
			
		}
		return head1;
		
	}
	
	public static node<Integer> takeInput2(){
		node<Integer> head2 = null;
		node<Integer> tail2 = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		while(data!=-1) {
			node<Integer> newNode = new node<Integer>(data);
			if(head2==null) {
				head2 = newNode;
				tail2 = newNode;
			}
			else {
				tail2.next = newNode;
				tail2 = newNode;  // OR tail = tail.next;
				
			}
			data = sc.nextInt();
			
		}
		return head2;
		
	}
	
	public static node<Integer> merged(node<Integer>head1,node<Integer>head2){
		node<Integer>head3 = null;
		node<Integer>tail3 = null;
		node<Integer>t1 = head1;
		node<Integer>t2 = head2;
		while(t1.next!=null && t2.next!=null) {
			if(head3==null) {
				if(head1.data<=head2.data) {
					head3 = head1;
				}
				else {
					head3 = head2;
				}
			}
			if(t1.data<t2.data) {
				tail3.next = t1;
				t1 = t1.next;
			}
			else {
				tail3.next = t2;
				t2 = t2.next;
			}
		}
		
		//remaining list printing
		
		while(t1.next!=null) {
			tail3.next = t1;
			t1 = t1.next;
		}
		while(t2.next!=null) {
			tail3.next = t2;
			t2 = t2.next;
		}
		return head3;
		
	}
	

	public static void main(String[] args) {
		node<Integer>h1 = takeInput1();
		node<Integer>h2 = takeInput2();
		node<Integer> merge = merged(h1, h2);
		while(merge.next!=null) {
			System.out.print(merge.data+" ");
			merge = merge.next;
		}
	}

}
