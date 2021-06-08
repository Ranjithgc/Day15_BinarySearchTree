package com.binarysearchtree;

public class BinaryNode<T> {
	T data;
    	BinaryNode<T> left;
    	BinaryNode<T> right;

    	public BinaryNode(T data) {
        	this.data = data;
        	this.left = null;
        	this.right = null;
    	}

    	public T getData() {
        	return data;
    	}

    	public void setData(T data) {
        	this.data = data;
    	}

    	public  BinaryNode<T> getLeft() {
        	return left;
    	}

    	public void setLeft(BinaryNode<T> left) {
        	this.left = left;
    	}

   	public BinaryNode<T> getRight() {
        	return right;
    	}

    	public void setRight(BinaryNode<T> right) {
        	this.right =right;
    	}
}