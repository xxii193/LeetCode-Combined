package com.test;
import java.util.*;
public class ValidateBinarySearchTree {
	 
    public boolean isValidBST(TreeNode root) {
       if(root == null)
    	   return true;
       List<Integer> result = new ArrayList<Integer>();
       result = BinaryTreeInorderTraversal(root);
       for(int i = 1; i < result.size(); i++){
    	   if(result.get(i) <= result.get(i - 1)){
    		   return false;
    	   }
       }
       return true;
    }
    public List<Integer> BinaryTreeInorderTraversal(TreeNode root){
    	if(root == null)
    		return null;
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	TreeNode node = root;
    	
    	while(!stack.isEmpty() || node != null){
    		if(node != null){
    			stack.push(node);
    			node = node.left;
    		}
    		else{
    			node = stack.pop();
    			list.add(node.val);
    			node = node.right;
    		}
    		
    	}
    	return list;
    }
    
    
    public static void main(String[] args){
    	TreeNode root = new TreeNode(4);
    	TreeNode l = new TreeNode(3);
    	TreeNode lr = new TreeNode(5);
    	root.left = l;
    	l.right = lr;
    	ValidateBinarySearchTree t = new ValidateBinarySearchTree();
    	System.out.println(t.isValidBST(root));
    }
}
