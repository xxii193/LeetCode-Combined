package com.test;

class Result{
	int single;
	int max;
	Result(int single, int max){
		this.max = max;
		this .single = single;
	}
}
public class BinaryTreeMaximumPathSum {
	public Result maxPathSum(TreeNode root){
		if(root == null){
			return new Result(0,Integer.MIN_VALUE);
		}
		Result left = maxPathSum(root.left);
		Result right = maxPathSum(root.right);
		
		int singleT = Math.max(left.single, right.single) + root.val;
		singleT = Math.max(singleT, 0);
		int maxT = Math.max(left.max, right.max);
		maxT = Math.max(maxT, left.single + right.single + root.val);
		return new Result(singleT, maxT);
		
    }
}