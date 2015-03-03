package com.test;
/*
 * treenode = list的中间节点
 * treenode.left = list左半部分的中间节点
 * treenode.right = list右半部分的中间节点、
 * */
public class ConvertSortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        
         if(head == null)
         	return null;
         if(head.next == null)
        	 return new TreeNode(head.val);
         
         ListNode beforeMid = middleNode(head);
         ListNode end = beforeMid.next.next;
         TreeNode root = new TreeNode(beforeMid.next.val);
         beforeMid.next = null;
         root.left = sortedListToBST(head);
         root.right = sortedListToBST(end);
         
         return root;
        
    }
    
    public ListNode middleNode(ListNode start){
        if(start.next == null)
        	return start;
    	ListNode fast = start;
        ListNode slow = start;
    	while(fast.next != null && fast.next.next != null){
    		fast = fast.next.next;
    		start = slow;
    		slow = slow.next;
    	}
    	return start;
    }
}
