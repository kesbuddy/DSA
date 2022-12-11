package linked;

import java.util.Scanner;

public class middle_better {
	
public static int middle(node<Integer> head){
	   node<Integer> slow = head;
       node<Integer> fast = head.next;
       while(fast!=null){
           fast = fast.next;
           if(fast!=null){
               fast = fast.next;
           }
           slow = slow.next;
       }
       int ans = slow.data;
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
		node<Integer> head = takeInput();
		System.out.print(middle(head)+" ");
//		print(head2);

	}
int ans = 

}
