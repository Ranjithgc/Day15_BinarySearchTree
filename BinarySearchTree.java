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
}