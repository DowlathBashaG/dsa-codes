package io.dowlath.dsa.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class Find_Contains_Duplicate {
    public static void main(String[] args) {
        int[] a = { 1,2,3,4,5};
        boolean containsDuplicate = containsDuplicate(a);
        System.out.println("This given array contains duplicate .... : "+ containsDuplicate);
    }

    private static boolean containsDuplicate(int[] a) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<a.length;i++){
            if(set.contains(a[i])){
                return true;
            }else{
                set.add(a[i]);
            }
        }
        return false;
    }

}
