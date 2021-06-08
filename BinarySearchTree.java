package com.binarysearchtree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BinarySearchTree {

	/**
     	* uc1 testcase
     	*/
    	@Test
    	public void Elements_Added_Returns_Size3() {
        	BinaryTree<Integer> binaryTree = new BinaryTree<>();
        	binaryTree.add(56);
        	binaryTree.add(30);
        	binaryTree.add(70);
        	Assert.assertEquals(3, binaryTree.size());
    	}


        /**
     	* uc2 testcase to create binary tree
     	*/
    	@Test
    	public void Elements_Added_To_Create_BinaryTree_Returns_Size13() {
        	BinaryTree<Integer> binaryTree = new BinaryTree<>();
        	binaryTree.add(56);
        	binaryTree.add(30);
        	binaryTree.add(70);
        	binaryTree.add(22);
        	binaryTree.add(40);
        	binaryTree.add(60);
        	binaryTree.add(95);
        	binaryTree.add(11);
        	binaryTree.add(65);
        	binaryTree.add(3);
        	binaryTree.add(16);
        	binaryTree.add(63);
        	binaryTree.add(67);
        	Assert.assertEquals(13, binaryTree.size());
    	}

}