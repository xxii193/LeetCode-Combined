package com.test;

public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        if(s.length() == 0){
        	return checkIsEmpty(p);
        }
        
        if(p.length() == 0)
        	return false;
        
        char s0 = s.charAt(0);
        char p0 = p.charAt(0);
        char p1 = '0';
        if(p.length() > 1)
        	p1 = p.charAt(1);
        if(p1 == '*'){
        	if(isEqual(s0,p0)){
        		return isMatch(s,p.substring(2)) || isMatch(s.substring(1),p);
        	}
        	else{
        		return isMatch(s,p.substring(2));
        	}
        }
        else{
        	if(isEqual(s0, p0)){
        		return isMatch(s.substring(1),p.substring(1));
        	}
        	else
        		return false;
        }
    }
    
    public boolean isEqual(char c1, char c2){
    	if(c1 == c2 || c2 == '.')
    		return true;
    	else 
    		return false;
    }
    
    public boolean checkIsEmpty(String str){
    	if(str.length() % 2 != 0)
    		return false;
    	for(int i = 1; i < str.length(); i += 2){
    		if(str.charAt(i) != '*')
    			return false;
    	}
    	return true;
    }
}
