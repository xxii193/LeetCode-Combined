package com.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal2 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null) {
			return result;
		}
		queue.offer(root);
		int currLength = 1;
		int nextLength;
		while (currLength != 0) {
			nextLength = 0;
			List<Integer> level = new ArrayList<Integer>();

			while (currLength != 0) {
				TreeNode node = queue.poll();
				currLength--;
				level.add(node.val);
				if (node.left != null) {
					queue.offer(node.left);
					nextLength++;
				}
				if (node.right != null) {
					queue.offer(node.right);
					nextLength++;
				}

			}
			result.add(level);
			currLength = nextLength;
		}
		List<List<Integer>> result2 = new ArrayList<List<Integer>>();

		for (int i = 0; i < result.size(); i++) {
			result2.add(result.get(result.size() - i - 1));
		}
		return result2;
	}
}
