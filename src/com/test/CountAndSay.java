package com.test;
/*
The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.

思路：
f(n) = 
遍历f(n-1)
  if(同一个数字)
         个数累加
  if(不同的数字)
          返回上个数字的个数+数字 
 */
public class CountAndSay {
    public String countAndSay(int n) {
        if(n == 1)
        	return "1";
        String pre = countAndSay(n - 1);
        
        int count = 1;
        char c = pre.charAt(0);
        String result = "";
        if(pre.length() == 1){
        	result = "1"+c;
        	return result;
        }
        	
        for(int i = 1; i < pre.length(); i++){
        		if(pre.charAt(i) != c){
        			result += ( String.valueOf(count) + c );
        			c = pre.charAt(i);
        			count = 1;
        		}
        		else{
        			count ++;
        			
        		}
        	
        }
        result += (String.valueOf(count) + c);
        return result;
    }
    
    
    public static void main(String[] args ){
    	CountAndSay t = new CountAndSay();
    	System.out.println(t.countAndSay(4));
    }
}
