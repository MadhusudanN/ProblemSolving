package com.java.coding.practise.trees;

import com.java.coding.practise.trees.model.TreeNode;

public class HeightofBT {
	
	/*
	 * Assumption :: root node is considered as level 0.
	 * The height of a binary tree is determined based on max height among left and right subtree.
	 *  
	 */
	public int getHeightofBT(TreeNode root)
	{
		if (root == null) // Base condition to return when leaf node is encountered.
			return 0;

		return 1 + Math.max(getHeightofBT(root.getLeft()), getHeightofBT(root.getRight()));

	}

}
