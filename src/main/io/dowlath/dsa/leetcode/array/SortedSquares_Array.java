package io.dowlath.dsa.leetcode.array;

import java.util.Arrays;

/*
       I/P :  {-4,-1,0,3,10};
       O/P :  [0, 1, 9, 16, 100]
 */
public class SortedSquares_Array {
    public static void main(String[] args) {
        int[] A = {-4,-1,0,3,10};
        int[] result = sortedSquares(A);
        System.out.println(Arrays.toString(result));
    }

    private static int[] sortedSquares(int[] a) {
        for(int i=0;i<a.length;i++){
            a[i] = a[i] * a[i];
        }
        Arrays.sort(a);
        return a;
    }
}
