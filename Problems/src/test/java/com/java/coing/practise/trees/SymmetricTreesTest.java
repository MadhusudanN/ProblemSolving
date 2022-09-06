package com.java.coing.practise.trees;

import org.junit.Test;

import com.java.coding.practise.trees.SymmetricTrees;
import com.java.coding.practise.trees.model.TreeNode;

import junit.framework.Assert;

public class SymmetricTreesTest {
	
	@Test
	/*
	 * Positive test case
	 */
	public void test1()
	{

		TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, null)),
				new TreeNode(2, new TreeNode(4, null, null), new TreeNode(3, null, null)));
		SymmetricTrees symmetric = new SymmetricTrees();
		Assert.assertEquals(true, symmetric.isSymmetric(root, root));
	}
	
	@Test
	/*
	 * Negative test case
	 */
	public void test2()
	{

		TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, null)),
				new TreeNode(2, new TreeNode(3, null, null), new TreeNode(3, null, null)));
		SymmetricTrees symmetric = new SymmetricTrees();
		Assert.assertEquals(false, symmetric.isSymmetric(root, root));
	}

}
