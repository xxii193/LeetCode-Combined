package com.test;

public class DecodeWays {
	public class Solution {
	    public int numDecodings(String s) {
	        if(s.length() == 0 || s.equals(null))
	        	return 0;
	    	int len = s.length();
	        int[] p = new int[len + 1];
	        p[0] = 1;
	        p[1] = (s.charAt(0) == '0') ? 0 : 1;
	        for(int i = 2; i<= len; i++){
	        	if(s.charAt(i - 1) != '0'){
	        		p[i] = p[i - 1];
	        	}
	        	int pre = s.charAt(i - 2) - '0';
	        	int now = s.charAt(i - 1) - '0';
	        	if((pre*10 + now) <= 26 &&(pre*10 + now) >= 10)
	        		p[i] += p[i - 2];
	        	
	        }
	        
	        return p[len];
	    }
}
}