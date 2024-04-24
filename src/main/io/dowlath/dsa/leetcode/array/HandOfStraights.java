package io.dowlath.dsa.leetcode.array;

import java.util.PriorityQueue;

/*
      I/P :   {1,2,3,6,2,3,4,7,8}; , W = 3
      O/P :   [1,2,3] , [2,3,4] , [6,7,8]  it means it is true.
 */
public class HandOfStraights {
    public static void main(String[] args) {
        int[] hand = {1,2,3,6,2,3,4,7,8};
        int w = 3;
        boolean isNStraightHand = isNStraightHand(hand,w);
        System.out.println(isNStraightHand);
    }

    private static boolean isNStraightHand(int[] hand, int w) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : hand) pq.add(i);
        while(!pq.isEmpty()){
            int cur = pq.poll();
            for(int i=1;i<w;i++){
                if(!pq.remove(cur+i)) return false;
            }
        }
        return true;
    }
}
