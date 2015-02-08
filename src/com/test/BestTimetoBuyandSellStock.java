package com.test;

public class BestTimetoBuyandSellStock {
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
}
