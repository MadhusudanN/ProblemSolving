package com.java.coding.practise.trees;

import com.java.coding.practise.trees.model.TreeNode;

public class IdenticalTrees {
	
	public boolean identical(TreeNode tree1, TreeNode tree2)
	{
		/*
		 * The below condition checks for structural difference among the trees
		 */
		if (tree1 == null && tree2 != null || tree1 != null && tree2 == null) {
			System.out.println("Found structural difference");
			return false;
		/*
		 *  The below conditions is check for identicalness (Either nodes can be null or values can be same.)
		 */
		} else if (tree1 == null && tree2 == null) {
			return true;
		} else if (tree1.getLeft() == null && tree1.getRight() == null && tree2.getLeft() == null
				&& tree2.getRight() == null && tree1.getValue() == tree2.getValue()) {
			return true;
		}
		/*
		 *  The below condition checks for inequality where values of nodes are different.
		 */
		else if (tree1.getValue() != tree2.getValue())
		{
			System.out.println("Found difference in value.");
			return false;
		}

		return (identical(tree1.getLeft(), tree2.getLeft()) && identical(tree1.getRight(), tree2.getRight()));
	}

}
