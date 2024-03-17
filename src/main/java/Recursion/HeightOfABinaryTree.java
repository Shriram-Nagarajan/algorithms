package Recursion;

public class HeightOfABinaryTree {

	private static class Node {
		int data;
		Node left;
		Node right;
		
		private Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
		private Node(Node left, Node right) {
			this(0, left, right);
		}
		
	}
	
	private static int height(Node root) {
		
		if(root == null) // Base condition
			return 0;
		
		int leftHeight = height(root.left); // Hypothesis
		int rightHeight = height(root.right); // Hypothesis
		
		return Math.max(leftHeight, rightHeight) + 1; // induction
	}
	
	public static void main(String[] args) {
		Node root = new Node(null, null);
		root.left = new Node(null, null);
		root.left.left = new Node(null, null);
		root.right = new Node(null, null);
		root.right.right = new Node(null, null);
		root.right.right.right = new Node(null, null);
		int height = height(root);
		System.out.println("Height of the given tree: " + height);
	}
}
