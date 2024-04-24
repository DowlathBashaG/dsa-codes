package io.dowlath.dsa.leetcode.array;
/*
        O/P : Min Cost Climbing .... : 15
 */
public class Min_Cost_Climbing_Stairs {
    public static void main(String[] args) {
        int[] cost = {10,15,20}; // {1,100,1,1,1,100,1,1,100,1};
        System.out.println("Min Cost Climbing .... : "+ minCostClimbingStairs(cost));
    }

    private static int minCostClimbingStairs(int[] cost) {
        for(int i=0;i<cost.length;i++){
            if(i == 0 || i == 1) continue;
            cost[i] = cost[i] + Math.min(cost[i-1],cost[i-2]);
        }
        return Math.min(cost[cost.length-1],cost[cost.length-2]);
    }
}
