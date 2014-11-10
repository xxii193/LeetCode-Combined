package com.test;

public class MergeTwoSortedLists {
	public ListNode Solution (ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode result = null;
		ListNode first = null;
		while(l1 != null && l2 != null){
			if (l1.val <=  l2.val) {
				if (first == null){
					first = l1;
					result = first;
				}else{
					result.next = l1;
					result = result.next;
					
				}
				l1 = l1.next;
				
			}else{
			
			
				if (first == null){
					first = l2;
					result = l2;
				}else{
					result.next = l2;
					result = result.next;
				}
				l2 = l2.next;
			}
		}
		
		if (l1 != null){
			result.next = l1;
		}else if (l2 != null) {
			result.next = l2;
		}
		return first;
		
		
	}

}
