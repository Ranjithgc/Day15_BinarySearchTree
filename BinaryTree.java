package com.binarysearchtree;

public class BinaryTree<T extends Comparable<T>> {
	private BinaryNode<T> root;

    	public void add(T data) {
        	this.root = addRecursively(root, data);
    	}

	// uc1: create Binary Search Tree by adding 56, 30 and 70 
    	public BinaryNode<T> addRecursively(BinaryNode<T> root, T data) {
        	if(root == null) {
            		return new BinaryNode<T>(data);
		}
     		else if(root.getData().compareTo(data) > 0) {
            		root.left = addRecursively(root.left, data);
		}
        	else if(root.getData().compareTo(data) == 0) {
            		return root;
		}
        	else {
           		root.right = addRecursively(root.right, data);
 		}
        	return root;
    	}
	
	// uc2: Ability to create Binary Tree And added use size()
	public int size() {
        	return sizeOfBinarySearchTree(root);
    	}

    	public  int sizeOfBinarySearchTree(BinaryNode<T> root) {
        	if(root == null)
            		return 0;
        	else
            		return 1 + sizeOfBinarySearchTree(root.left) + sizeOfBinarySearchTree					(root.right);
    	}
}