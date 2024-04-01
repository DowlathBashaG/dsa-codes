package io.dowlath.dsa.leetcode.array;
/*
       i/p :
               arr = [7,4,6,3,9,1]
               k = 3
       o/p :
              Kth Smallest Element .... : 6
 */

import java.util.Collections;
import java.util.PriorityQueue;

public class Find_Kth_Largest_Element {
    public static void main(String[] args) {
        int[] arr =  {7,4,6,3,9,1};
        int k = 3;
        int KthLargestElement = KthLargestElement(arr,k);
        System.out.println("Kth Largest Element .... : "+ KthLargestElement);
    }

    private static int KthLargestElement(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int l = k-1;

        while(l > 0){
            pq.poll();
            l = l-1;
        }
        return pq.peek();
    }
}
