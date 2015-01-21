package com.test;


import java.util.Arrays;

public class ScrambleString {
    public boolean isScramble(String s1, String s2) {
    	if(s1 == null||s2 == null)
    		return false;
    	int len1 = s1.length();
        if(len1 != s2.length())
        	return false;
        if(s1.equals(s2))
        	return true;
        if(len1 == 1 && !s1.equals(s2)){
        
        		return false;
        }
        	
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();
        
        Arrays.sort(char1);
        Arrays.sort(char2);
        
        if(!new String(char1).equals(new String(char2)))
        	return false;
        
        boolean result = false;
        for(int i = 1; i < len1 && !result; i++){
        	result = isScramble(s1.substring(0, i), s2.substring(0, i))&& isScramble(s1.substring(i, len1), s2.substring(i, len1));
        	if(!result)
        		result = isScramble(s1.substring(0, i), s2.substring(len1-i, len1))&& isScramble(s1.substring(i, len1), s2.substring(0, len1-i));
        	
        }
        
        return result;
        
    }
    public static void main(String[] args){
    	String str1 = "abc";
    	String str2 = "bca";
    	
    	ScrambleString t = new ScrambleString();
    	System.out.println(t.isScramble(str1, str2));
    }
}
