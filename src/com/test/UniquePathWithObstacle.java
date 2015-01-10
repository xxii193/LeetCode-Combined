package com.test;

public class UniquePathWithObstacle {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null || obstacleGrid.length == 0 ||obstacleGrid[0][0] == 1)
        	return 0;
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] result = new int[row][col];
        result[0][0] = 1;
        for(int m = 1; m < col; m++){
        	if(obstacleGrid[0][m] == 1 || result[0][m - 1] == 0)
        		result[0][m] = 0;
        	else
        		result[0][m] = 1;
        	
        }
        for(int n = 1; n < row; n++){
        	if(obstacleGrid[n][0] == 1 || result[n - 1][0] == 0)
        		result[n][0] = 0;
        	else
        		result[n][0] = 1;
        	
        }
        for(int i = 1; i < col; i++){
        	for(int j = 1; j < row; j++){
        		if(obstacleGrid[j][i] == 0)
        			result[j][i] = result[j - 1][i] + result[j][i - 1];
        		else
        			result[j][i] = 0;
        		
        	}
        }
        
        return result[row - 1][col - 1];
    }
    
    public static void main(String[] args){
    	UniquePathWithObstacle t = new UniquePathWithObstacle();
    	int arrays[][] = {{0},{0}};
    	System.out.println(t.uniquePathsWithObstacles(arrays));
    }
}


