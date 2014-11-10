package com.test;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
        	return true;
        return nodesSymmetric(root.left, root.right);
    }
    public boolean nodesSymmetric(TreeNode left, TreeNode right){
    	if(left == null && right == null)
    		return true;
    	else if((left == null && right != null) || (left != null && right == null) || (left.val != right.val) ){
    		return false;
    	}
    	else
    		return nodesSymmetric(left.left, right.right) && nodesSymmetric(left.right, right.left);

    }
    
    public static void main(String[] args){
    	TreeNode root = new TreeNode(4);
    	TreeNode l = new TreeNode(4);
    	root.left = l;
    	SymmetricTree t = new SymmetricTree();
    	System.out.println(t.isSymmetric(root));
    }
}
