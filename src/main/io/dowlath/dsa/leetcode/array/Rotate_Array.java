package io.dowlath.dsa.leetcode.array;

import java.util.Arrays;

/*
      (i+k) % len
 */
public class Rotate_Array {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7}; // result : Rotated Array ... : [5, 6, 7, 1, 2, 3, 4]
        int k = 3 ;
        int[] result = rotate_array(a,k);
        System.out.println("Rotated Array ... : "+ Arrays.toString(result));
    }

    private static int[] rotate_array(int[] a, int k) {
        int[] result = new int[a.length];
        for(int i=0;i<result.length;i++){
            result[(i+k) % a.length] = a[i];
        }
        return result;
    }

}
