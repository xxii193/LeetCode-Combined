package com.test;
import java.util.*;
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
    	if(triangle.size() == 0 || triangle == null)
    		return 0;
    	if(triangle.size() == 1)
    		return triangle.get(0).get(0);
        int length = triangle.get(triangle.size() - 1).size();
    	int[] result = new int[length];
    	for(int j = 0; j <= length - 1; j++){
    		result[j] = triangle.get(triangle.size() - 1).get(j); 
    	}
    	for(int i = triangle.size() - 2; i >= 0; i--){
    	   for(int m = 0; m <= triangle.get(i).size() - 1; m++){
    		   result[m] = triangle.get(i).get(m) + Math.min(result[m], result[m + 1]);
    		   
    	   }
    	}
    	
    	result[0] = Math.min(result[0], result[1]);
    	
    	return result[0];
    	
    }
    public static void main(String[] agrs){
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	List<Integer> t1 = new ArrayList<Integer>();
    	List<Integer> t2 = new ArrayList<Integer>();
    	t1.add(1);
    	t2.add(2);
    	t2.add(3);
    	list.add(t1);
    	list.add(t2);
    	Triangle tt = new Triangle();
    	System.out.println(tt.minimumTotal(list));
    	
    }
}
