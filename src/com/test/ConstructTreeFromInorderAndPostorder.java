package com.test;

public class ConstructTreeFromInorderAndPostorder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
    	if (inorder.length == 0 || inorder == null)
    		return null;
    	TreeNode root = oneRecursive(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    	return root;
        
    }
    public TreeNode oneRecursive(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd){
    	if (inStart > inEnd)
    		return null;
    	TreeNode node = new TreeNode(postorder[postEnd]);
    	int index = findIndex(inorder, inStart, inEnd, postorder[postEnd]);
    	node.left = oneRecursive(inorder, inStart, index - 1,postorder, postStart, postStart + index - inStart - 1);
    	node.right = oneRecursive(inorder, index + 1, inEnd,postorder, postStart + index - inStart, postEnd - 1);
    	return node;
    	
    }
    public int findIndex(int[] A, int start, int end, int val){
    int i = start;
    for (i = start; i<= end; i++){
    	if (A[i] == val)
    		return i;
    }
    
    	return -1;
    }
    
    public static void main(String[] args){
    	int[] postorder = {2,3,1};
    	int[] inorder = {2,1,3};
    	ConstructTreeFromInorderAndPostorder t = new ConstructTreeFromInorderAndPostorder();
    	TreeNode node = t.buildTree(inorder,postorder);
    	System.out.println(node.right.val);
    }
}


