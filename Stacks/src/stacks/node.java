package stacks;

public class node<T> {
	T data;
	node<T> next;
	
	node(T elem){
		this.data = elem;
		next = null;
	}

}
