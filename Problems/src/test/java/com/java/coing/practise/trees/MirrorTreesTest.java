package com.java.coing.practise.trees;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.coding.practise.trees.MirrorTree;
import com.java.coding.practise.trees.model.TreeNode;

public class MirrorTreesTest {
	
	@Test
	/*
	 *  Testcase with complete binary tree of height 2.
	 */
	public void test1()
	{
		TreeNode input = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
		TreeNode expected = new TreeNode(1, new TreeNode(3, null, null), new TreeNode(2, null, null));

		MirrorTree mirrorTree = new MirrorTree();
		TreeNode result = mirrorTree.mirrorTree(input);
		assertEquals(expected.getLeft().getValue(), result.getLeft().getValue());
		assertEquals(expected.getRight().getValue(), result.getRight().getValue());

	}
	
	@Test
	/*
	 *  Testcase with incomplete binary tree of height 3.
	 *  Left subtree is deeper.
	 */
	public void test2()
	{
		TreeNode input = new TreeNode(10, new TreeNode(20, new TreeNode(40, null, null), new TreeNode(60, null, null)),
				new TreeNode(30, null, null));
		TreeNode expected = new TreeNode(1, new TreeNode(30, null, null),
				new TreeNode(20, new TreeNode(60, null, null), new TreeNode(40, null, null)));

		MirrorTree mirrorTree = new MirrorTree();
		TreeNode result = mirrorTree.mirrorTree(input);
		assertEquals(expected.getLeft().getValue(), result.getLeft().getValue());
		assertEquals(expected.getRight().getValue(), result.getRight().getValue());

		assertEquals(expected.getRight().getLeft().getValue(), result.getRight().getLeft().getValue());
		assertEquals(expected.getRight().getRight().getValue(), result.getRight().getRight().getValue());

	}

}
