package com.test;

public class MaxProfit {
public int maxProfit(int[] prices) {
       if(prices.length <=1 || prices == null)
    	   return 0;
        int minValue = prices[0];
        int maxProfit = 0;
        for(int i = 1; i< prices.length; i++){
            
            if(prices[i] < minValue){
            	minValue = prices[i];
            }else{
            	maxProfit = Math.max(maxProfit,prices[i] - minValue);
            }
            	
        }
        return maxProfit;
    }

public static void main(String[] args){
	int[] prices = {33,12,1,5,17,55};
	MaxProfit t = new MaxProfit();
	System.out.println(t.maxProfit(prices));
}
}
