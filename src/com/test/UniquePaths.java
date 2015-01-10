package com.test;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
    	if(m == 0 || n == 0)
    		return 0;
    	
        int[][] result = new int[m][n];
        for(int i = 0; i < n; i++){
        	result[0][i] = 1;
        }
        for(int j = 1; j < m; j++){
        	result[j][0] = 1;
        }
    	for(int col = 1; col < n; col++){
        	for(int row = 1; row < m; row++){
        		result[row][col] = result[row - 1][col] + result[row][col - 1];
        	}
        }
    	return result[m - 1][n - 1];
    }
}
