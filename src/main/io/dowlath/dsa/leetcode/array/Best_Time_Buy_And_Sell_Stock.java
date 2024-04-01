package io.dowlath.dsa.leetcode.array;

/*
           7   1    5    3    6    4    => 4+3 = 7
                 4    +     3           => 7


           1   2    3    4    5    6

             1   1    1    1     1      =>  5


 */

public class Best_Time_Buy_And_Sell_Stock {
    public static void main(String[] args) {
        int[]  a = {7,1,5,3,6,4};
        int[]  b = {1,2,3,4,5,6};
        int profit_a = best_time_buy_sell(a);
        int profit_b = best_time_buy_sell(b);
        System.out.println("The best time for buy and sell & profit a & b... : "+ profit_a + "   "+ profit_b );
    }

    private static int best_time_buy_sell(int[] prices) {
        int profit = 0;
        for(int i= 1; i<prices.length;i++){
            if(prices[i-1] < prices[i]){
                profit = profit + prices[i] - prices [i-1];
            }
        }
        return profit;
    }
}
