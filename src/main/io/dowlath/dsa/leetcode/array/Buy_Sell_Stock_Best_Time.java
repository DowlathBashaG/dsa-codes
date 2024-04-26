package io.dowlath.dsa.leetcode.array;
/*
     I/P :  {7,1,5,3,6,4}  //we have profit 5 , 6-1 = 5.
     O/P :  Best Time to buy or sell stocks ... : 5
 */
public class Buy_Sell_Stock_Best_Time {
    public static void main(String[] args) {
        // Days ....... 1,2 3 4 5 6
        int[] prices = {7,1,5,3,6,4}; // given example we will buy on day 2 and sell it on day 5 then
        // we have profit 5 , 6-1 = 5.
        // another example [7,6,4,3,1] in this case no transaction are done and max profit = 0.
        System.out.println("Best Time to buy or sell stocks ... : "+ maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int i : prices){
            if(i<min) min = i;
            else{
                profit = Math.max(profit,i-min);
            }
        }
        return profit;
    }
}
