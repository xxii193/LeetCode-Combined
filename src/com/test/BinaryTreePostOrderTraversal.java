package com.test;
import java.util.*;

public class BinaryTreePostOrderTraversal {
	public List<Integer> solution(TreeNode root) {
		
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        TreeNode pre = null;
        while(!stack.isEmpty() || node != null){
        	if (node!= null){
             	stack.push(node);
             	node = node.left;
             }
        	else{
        		TreeNode tmp = stack.peek();
        		if(tmp.right !=null && tmp.right != pre){
        			node = tmp.right;
        		}
        		else{
        			stack.pop();
                    result.add(tmp.val);
                    node = null;
                    pre = tmp;
        		}
             }
        	
        }
       return result;
        
        
    }
}
