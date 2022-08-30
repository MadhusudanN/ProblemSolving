package com.java.coing.practise.trees;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.coding.practise.trees.HeightofBT;
import com.java.coding.practise.trees.model.TreeNode;

public class HeightofBTTest {
	
	@Test
	/*
	 *  Root node is null, so tree height will be 0.
	 */
	public void test1()
	{
		TreeNode node = null;
		int expectedHeight = 0;
		HeightofBT height = new HeightofBT();
		assertEquals(expectedHeight,height.getHeightofBT(node));
	}
	
	@Test
	/*
	 *  Only root node is present.
	 */
	public void test2()
	{
		TreeNode node = new TreeNode(1, null, null);
		int expectedHeight = 1;
		HeightofBT height = new HeightofBT();
		assertEquals(expectedHeight, height.getHeightofBT(node));
	}
	
	@Test
	/*
	 *  Only Left subtree is present.
	 */
	public void test3()
	{
		TreeNode node = new TreeNode(1, new TreeNode(2,null,null), null);
		int expectedHeight = 2;
		HeightofBT height = new HeightofBT();
		assertEquals(expectedHeight, height.getHeightofBT(node));
	}
	
	@Test
	/*
	 *  Only Right subtree is present.
	 */
	public void test4()
	{
		TreeNode node = new TreeNode(1, null, new TreeNode(2,null,null));
		int expectedHeight = 2;
		HeightofBT height = new HeightofBT();
		assertEquals(expectedHeight, height.getHeightofBT(node));
	}
	
	@Test
	/*
	 *  Both left and right sub-tree are present.
	 *  Right subtree height is 2
	 *  Left subtree height is 1.
	 *  So overall height of tree will be 3.
	 */
	public void test5()
	{
		TreeNode node = new TreeNode(1, new TreeNode(2, null, null),
				new TreeNode(3, new TreeNode(4, null, null), null));
		int expectedHeight = 3;
		HeightofBT height = new HeightofBT();
		assertEquals(expectedHeight, height.getHeightofBT(node));
	}

}
