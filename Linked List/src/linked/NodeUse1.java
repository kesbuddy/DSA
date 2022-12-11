package linked;

import java.util.*;

public class NodeUse1 {

    public static void main(String[] args) {
        node<Integer> node1 = new node<>(10);
        node<Integer> node2 = new node<>(20);
        System.out.println("The data of node 2 is : ", node2.data);
        node<Integer> node3 = node1;
        System.out.println("The address of node 3 is : ", node3);

    }

}
