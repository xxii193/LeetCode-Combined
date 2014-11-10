package com.test;

import java.util.*;

public class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    public void push(int x) {
    	if(minStack.isEmpty() || x <= minStack.peek()){
    		minStack.push(x);
    	}
        stack.push(x);
    }

    public void pop() {
        if(minStack.peek().equals(stack.peek()))
        	minStack.pop();
    	stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
    
    
    public static void main(String[] args){
    	
    	MinStack stack = new MinStack();
    	stack.push(4);
    	stack.push(3);
    	stack.push(3);
    	stack.pop();
    	System.out.println(stack.getMin());
    }
}
