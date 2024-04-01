package io.dowlath.dsa.leetcode.array;

import java.util.Arrays;

/*
       i/p : {1,2,3,4}  =>  o/p : 24,12,8,6

       Given Array         => [ 1, 2, 3, 4]
       PrefixProduct Array => [ 1,  1,  2,  6 ] in the concept of dynamic programming.
       SuffixProduct Array => [ 24, 12, 4,  1 ]
       Result              => [ 24, 12, 8,  6 ]   multiply by prefix product array and suffix product array

 */
public class Product_Of_Array_Except_Self {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] result = productExceptSelf(a);
        System.out.println(Arrays.toString(result));
    }

    private static int[] productExceptSelf(int[] a) {
        int[] prefixProduct = new int[a.length];
        prefixProduct[0] = 1;
        for(int i=1;i<a.length;i++){
            prefixProduct[i] = prefixProduct[i-1] * a[i-1];
        }
        int suffixProduct = 1;
        for(int i= a.length-1;i >= 0;i--){
            prefixProduct[i] = prefixProduct[i] * suffixProduct;
            suffixProduct = suffixProduct * a[i];
        }
        return prefixProduct;
    }


}
