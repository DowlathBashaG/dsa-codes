package io.dowlath.dsa.leetcode.array;
/*
     I/P : [ 3,2,2 ]
     O/P : 2
     Condition : n/2 times....more than.
 */

import java.util.Arrays;

public class Find_Majority_Element {
    public static void main(String[] args) {
        int[] a = {3,2,2};
        System.out.println("Given Array ");
        System.out.println(Arrays.toString(a));
        System.out.println(majorityElement(a));
    }

    private static int majorityElement(int[] a) {
        for(int i=0;i<a.length;i++){
            int count = 1;
            for(int j = i+1;j<a.length;j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            if(count > a.length /2 ){
                return a[i];
            }

        }
        return -1;
    }
}
