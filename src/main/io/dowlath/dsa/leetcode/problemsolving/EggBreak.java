package io.dowlath.dsa.leetcode.problemsolving;

/*
       n -> eggs
       k -> floors

       getDrops(n,k) - Given n eggs and k floors building , minimum of drops to determine
                       the floor from which egg does not break if dropped.

       getDrops(n,k) - 1 + Min (x = 1,2,3....k) [ drops( n-1 , k-1 ), drops( n, k-i ) ];

       Note :  i is iteration from the for loop. based on floors.


 */
public class EggBreak {
    public static void main(String[] args) {
        int eggs = 3;
        int floors = 6;
        int eggBreak = inWhichFloorEggWillBreak(eggs,floors);
        System.out.println(
                "Minimum no of drops required with "+ eggs + " eggs " +
                "and floors " + floors +
                " is : "+eggBreak);
    }

    private static int inWhichFloorEggWillBreak(int eggs, int floors) {
        // base condition
        if( floors == 0 || floors == 1){
            return floors;
        }
        if( eggs == 1){
            return floors;
        }
        int minimumDrops = Integer.MAX_VALUE;
        int tempResult;
        for(int i = 1;i <= floors;i++ ){
            tempResult = Math.max(inWhichFloorEggWillBreak(eggs-1,i-1),
                                  inWhichFloorEggWillBreak(eggs,floors-i));
            minimumDrops = Math.min(tempResult,minimumDrops);
        }
        return minimumDrops + 1;
    }

}
