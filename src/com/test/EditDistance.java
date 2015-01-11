package com.test;

public class EditDistance {
    public int minDistance(String word1, String word2) {
    	if(word1 == null || word2 == null)
    		return 0;
        int length1 = word1.length();
        int length2 = word2.length();
        
        int[][] result = new int[length2 + 1][length1 + 1];
        
        for(int i = 0; i <= length1; i++){
        	result[0][i] = i;
        }
        for(int j = 1; j <= length2; j++){
        	result[j][0] = j;
        }
        
        for(int row = 1; row <= length2; row++){
        	for(int col = 1; col <= length1; col++){
        		if(word2.charAt(row - 1) != word1.charAt(col - 1)){
        		    int min = Math.min(result[row - 1][col], result[row][col - 1]);
        			result[row][col] = Math.min(result[row - 1][col - 1], min) + 1;
        		}else{
        			result[row][col] = result[row - 1][col - 1];
        		}
        		
        	}
        }
        
        return result[length2][length1];
        
    }
    public static void main(String[] args){
    	EditDistance t = new EditDistance();
    	System.out.println(t.minDistance("abc", "bc"));
    }
}
