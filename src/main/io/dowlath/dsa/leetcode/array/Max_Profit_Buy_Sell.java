package io.dowlath.dsa.leetcode.array;

public class Max_Profit_Buy_Sell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int profit = maxProfit(prices);
        System.out.println("Maximum Profit .... :"+ profit);
    }

    private static int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;
        int profit = 0;
        int left = 0;
        for(int right = 1; right < prices.length; right++){
            if( prices[right] > prices[left]){
                profit = Math.max(profit, prices[right] - prices[left]);
            } else {
                 left = right;
            }
        }
        return profit;
    }
}
