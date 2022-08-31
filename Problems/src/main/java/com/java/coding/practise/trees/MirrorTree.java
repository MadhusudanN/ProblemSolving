package com.java.coding.practise.trees;

import com.java.coding.practise.trees.model.TreeNode;

public class MirrorTree {
	
	public TreeNode mirrorTree(TreeNode root)
	{
		if (root == null) {
			return root;
		}
		TreeNode left = mirrorTree(root.getLeft());
		TreeNode right = mirrorTree(root.getRight());
		root.setLeft(right);
		root.setRight(left);
		return root;

	}

}
