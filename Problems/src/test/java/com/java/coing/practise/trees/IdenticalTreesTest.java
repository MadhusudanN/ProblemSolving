package com.java.coing.practise.trees;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.coding.practise.trees.IdenticalTrees;
import com.java.coding.practise.trees.model.TreeNode;

public class IdenticalTreesTest {
	
	@Test
	/*
	 *  Positive testcase
	 */
	public void test1()
	{
		TreeNode tree1 = new TreeNode(1, null, null);
		TreeNode tree2 = new TreeNode(1, null, null);

		IdenticalTrees identicalTrees = new IdenticalTrees();

		assertEquals(true, identicalTrees.identical(tree1, tree2));

	}
	
	@Test
	/*
	 *  Positive testcase
	 */
	public void test2()
	{
		TreeNode tree1 = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
		TreeNode tree2 = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));

		IdenticalTrees identicalTrees = new IdenticalTrees();

		assertEquals(true, identicalTrees.identical(tree1, tree2));

	}
	
	@Test
	/*
	 *  Negative testcase 
	 *  Tree structure not matching
	 */
	public void test3()
	{
		TreeNode tree1 = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
		TreeNode tree2 = new TreeNode(1, null, null);

		IdenticalTrees identicalTrees = new IdenticalTrees();

		assertEquals(false, identicalTrees.identical(tree1, tree2));

	}
	
	@Test
	/*
	 *  Negative testcase
	 *  Tree structure is same, values do not match.
	 */
	public void test4()
	{
		TreeNode tree1 = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
		TreeNode tree2 = new TreeNode(1, new TreeNode(3, null, null), new TreeNode(2, null, null));

		IdenticalTrees identicalTrees = new IdenticalTrees();

		assertEquals(false, identicalTrees.identical(tree1, tree2));

	}

}
