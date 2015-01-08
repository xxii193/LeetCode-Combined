package com.test;
import java.util.*;

public class WordBreak {
	public int maxLength(Set<String> dict){
		int max = 0;
		for(String str:dict){
			max = Math.max(str.length(), max);
		}
		return max;
	}
    public boolean wordBreak(String s, Set<String> dict) {
    	int length = s.length();
    	Boolean[] checked = new Boolean[length + 1];
    	
    	checked[0] = true;
       for(int i = 1; i < length + 1; i++){
    	   checked[i] = false;
    	   for(int j = 1; j <= i && j <= maxLength(dict); j++){
    		   if(checked[i - j] == true && dict.contains(s.substring(i - j,i))){
    				   checked[i] = true;
        			   break;
    		   }
    		   else{
    			   continue;
    		   }
    			   
    	   }
    	   
        }
    	
    		
    	return checked[length];
    	
    }
    
    public static void main(String[] agrs){
    	String s ="leetcode";
    	WordBreak t = new WordBreak();
    	HashSet<String> dict = new HashSet<String>();
    	dict.add("letcod");
    	dict.add("le");
    	dict.add("");
    	System.out.print(t.wordBreak(s, dict));
    }
}
