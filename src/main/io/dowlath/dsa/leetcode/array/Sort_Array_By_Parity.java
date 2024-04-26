package io.dowlath.dsa.leetcode.array;

import java.util.Arrays;

/*
        O/P :  Sort Array By Parity ... : [4, 5, 2, 7]
 */
public class Sort_Array_By_Parity {
    public static void main(String[] args) {
        int[] a = {4,2,5,7}; // Expected : {4,5,2,7}
        int[] sortArrayByParity = sortArrayByParity(a);
        System.out.println("Sort Array By Parity ... : "+ Arrays.toString(sortArrayByParity));
    }

    private static int[] sortArrayByParity(int[] a) {
        int even = 0;
        int odd = 1;
        while(even < a.length && odd < a.length){
            while(even < a.length && a[even] % 2 == 0) even += 2;
            while(even < a.length && a[odd] % 2 == 1) odd +=2;
            if(even < a.length && odd < a.length ){
                int tmp = a[even];
                a[even] = a[odd];
                a[odd] = tmp;
                even+=2;
                odd+=2;
            }
        }
        return a;
    }
}
