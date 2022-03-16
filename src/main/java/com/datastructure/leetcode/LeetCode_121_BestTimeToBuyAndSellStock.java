package com.datastructure.leetcode;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class LeetCode_121_BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 0 || prices == null) {
            return 0;
        }
        int max_profit = 0;
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else {
                if ((price - min) > max_profit) {
                    max_profit = price - min;
                }
            }
        }
        return max_profit;
    }
}