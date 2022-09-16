package com.bridgelab;

public class BinarySearchTree {
	
	static class Node {
		int data;
		Node left,right;
		
		Node(int data) {
			this.data = data;
		}
		
	}
	
	public static Node insert(Node root, int val) {
		if(root ==null) {
			root = new Node(val);
			return root;
		}
		//condition left or right
		if(root.data > val) {
			root.left = insert(root.left,val);
		}
		else {
			root.right = insert(root.right, val);
		}
		return root;
	}
	//verifying traversal is correct or not
	
	public static void inorder(Node root) {
		if(root ==null) {
			return;
		}
		
		inorder(root.left);
		System.out.println(root.data+" ");
		inorder (root.right);
	}
	
	public static void main(String args[]) {
		int values[] = {56,30,70,22,40,11,3,16,60,95,65,63,67};
		Node root = null;
		
		for(int i=0; i<values.length; i++) {
			root = insert(root,values[i]);
		}
		
		inorder(root);
		System.out.println();
		
	}
	
}
