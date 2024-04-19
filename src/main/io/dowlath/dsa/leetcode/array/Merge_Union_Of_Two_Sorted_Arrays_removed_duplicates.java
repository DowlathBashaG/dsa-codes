package io.dowlath.dsa.leetcode.array;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Merge_Union_Of_Two_Sorted_Arrays_removed_duplicates {
    public static void main(String[] args) {
        int[] a = {1,2,2,2,3};
        int[] b = {2,3,3,4,5,5};
        int n = a.length;
        int m = b.length;
       List<Integer> uni = UnionArray(a,b,n,m);
        for(int i : uni){
            System.out.print(i+" ");
        }
    }

    private static List<Integer> UnionArray(int[] a, int[] b, int n, int m) {
        TreeSet<Integer> set = new TreeSet<>();

        // Remove Duplicates from a
        for(int i : a){
            set.add(i);
        }

        // Remove Duplicates from b
        for(int i : b){
            set.add(i);
        }
        // Loading set to array list
        List<Integer> list = new ArrayList<>();
        for(int i : set){
            list.add(i);
        }
        return list;
    }
}
