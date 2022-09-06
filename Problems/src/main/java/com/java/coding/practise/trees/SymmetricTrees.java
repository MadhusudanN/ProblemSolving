package com.java.coding.practise.trees;

import com.java.coding.practise.trees.model.TreeNode;

public class SymmetricTrees {
	
	public boolean isSymmetric(TreeNode node1, TreeNode node2)
	{

		if (node1 == null && node2 == null) {
			return true;
		}
		
		/*
		 *  For tree to be symmetric, the tree and its mirror image should be same.
		 *  i.e, The left sub-tree of node1 should be same as right sub-tree of node2.
		 *       The right sub-tree of node1 should be same as left sub-tree of node2.
		 *  
		 */

		if (node1 != null && node2 != null && node1.getValue() == node2.getValue()) {

			return isSymmetric(node1.getLeft(), node2.getRight()) && isSymmetric(node1.getRight(), node2.getLeft());
		}

		return false;

	}

}
