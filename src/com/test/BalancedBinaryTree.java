package com.test;
public class BalancedBinaryTree {
//    public boolean isBalanced(TreeNode root) {
//    	if(root == null)
//    		return true;
//        if(Math.abs(getDepth(root.left)-getDepth(root.right)) >1)
//        	return false;
//        else
//        	return isBalanced(root.left) && isBalanced(root.right);
//    }
//    
//    public int getDepth(TreeNode root){
//		if( root == null)
//			return 0;
//		return Math.max(getDepth(root.left), getDepth(root.right)) + 1;
//	}
	
	
	public int getDepth(TreeNode root){
		if(root == null)
			return 0;
		int left = getDepth(root.left);
		int right = getDepth(root.right);
		if(left == -1 || right == -1)
			return -1;
		if(Math.abs(left - right) > 1)
			return -1;
		else
			return Math.max(left, right) + 1;
	}
	public boolean isBalanced(TreeNode root){
		return getDepth(root) !=  -1;
			
		
	}
}