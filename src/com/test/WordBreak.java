package com.test;
import java.util.*;

public class WordBreak {
    public boolean wordBreak(String s, Set<String> dict) {
    	int i = 0;
    	outer:
        while(i < s.length()){
        	for(int j = i + 1;j <= s.length();j++){
        		String str = s.substring(i, j);
        		if(dict.contains(str)){
        			if(j == s.length())
        				return true;
        			i = j;
        			continue outer;
        		}
        		
        	}
        	break;
        }
    	if(i == (s.length()- 1))
    		return true;
    	else
    		return false;
    	
    }
    
    public static void main(String[] agrs){
    	String s ="leetcode";
    	WordBreak t = new WordBreak();
    	HashSet<String> dict = new HashSet<String>();
    	dict.add("leetcode");
    	dict.add("le");
    	dict.add("");
    	System.out.print(t.wordBreak(s, dict));
    }
}
