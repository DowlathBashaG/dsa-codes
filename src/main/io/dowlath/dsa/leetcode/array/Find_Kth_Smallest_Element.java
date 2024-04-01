package io.dowlath.dsa.leetcode.array;

import java.util.Arrays;

/*
       i/p :
               arr = [7,4,6,3,9,1]
               k = 3
       o/p :
              Kth Smallest Element .... : 4
 */
public class Find_Kth_Smallest_Element {
    public static void main(String[] args) {
        int[] arr =  {7,4,6,3,9,1};
        int k = 3;
        int KthSmallestElement = KthSmallestElement(arr,k);
        System.out.println("Kth Smallest Element .... : "+ KthSmallestElement);
    }

    private static int KthSmallestElement(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }
}
