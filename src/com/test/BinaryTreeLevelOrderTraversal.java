package com.test;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
 	        List<List<Integer>> result = new ArrayList<List<Integer>>();
 	        if (root == null){
 	            return result;
 	        }
 	        queue.offer(root);
 	        while(!queue.isEmpty()){
 	            List<Integer> level = new ArrayList<Integer>();
 	            int size = queue.size();
 	           
 	           for(int i = 0; i < size; i++){
 	                TreeNode node = queue.poll();
 	                level.add(node.val);
 	                if (node.left != null){
 	                    queue.offer(node.left);
 	                }
 	                if (node.right != null){
 	                    queue.offer(node.right);
 	                }
 	               
 	            }
 	            result.add(level);
 	        }
 	        return result;
 	    }
 	    
}
