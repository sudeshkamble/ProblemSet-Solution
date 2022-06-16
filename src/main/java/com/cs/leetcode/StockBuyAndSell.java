package com.cs.leetcode;

import java.util.Arrays;

public class StockBuyAndSell {
    public static void main(String[] args) {
        System.out.println(buyNsell(new int[]{7,6,4,3,1}));
    }

    private static int buyNsell(int[] prices) {
        int maxProfit=0;
        int min=prices[0];

        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-min;
            if(profit>maxProfit){
                maxProfit=profit;
            }
            if(prices[i]<min){
                min=prices[i];
            }
        }

        return maxProfit;
    }
}
