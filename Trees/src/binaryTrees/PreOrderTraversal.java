package binaryTrees;

public class PreOrderTraversal {
	
	public static void preorder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		preorder(root.left);
		preorder(root.right);
		System.out.print(root.data+" ");
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
		BinaryTreeNode<Integer> rootleft = new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rootright = new BinaryTreeNode<Integer>(3);
		root.left = rootleft;
		root.right = rootright;
		BinaryTreeNode<Integer> rootll = new BinaryTreeNode<Integer>(4);
		BinaryTreeNode<Integer> rootlr = new BinaryTreeNode<Integer>(5);
		rootleft.left = rootll;
		rootleft.right = rootlr;
		BinaryTreeNode<Integer> rootlrl = new BinaryTreeNode<Integer>(6);
		rootlr.left = rootlrl;
		BinaryTreeNode<Integer> rootrl = new BinaryTreeNode<Integer>(7);
		BinaryTreeNode<Integer> rootrr = new BinaryTreeNode<Integer>(8);
		rootright.left = rootrl;
		rootright.right = rootrr;
		BinaryTreeNode<Integer> rootrrl = new BinaryTreeNode<Integer>(9);
		BinaryTreeNode<Integer> rootrrr = new BinaryTreeNode<Integer>(10);
		rootrr.left = rootrrl;
		rootrr.right = rootrrr;

	}

}
