package io.dowlath.dsa.leetcode.array;

import java.util.Arrays;

public class Is_It_Contains_Duplicates_from_Given_Array {
    public static void main(String[] args) {
        int[] a = {1,2,3,1};
        System.out.println("Is it contains duplicate elements in this array ... : "+containsDuplicate(a));
    }

    private static boolean containsDuplicate(int[] a) {
        Arrays.sort(a);
        for(int i=1; i<a.length; i++){
               if(a[i] == a[i-1]){
                    return true;
                }
        }
        return false;
    }
}
