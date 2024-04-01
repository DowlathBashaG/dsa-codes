package io.dowlath.dsa.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/*
            a[] = { 1 2 2 3 4 }  in this array missing element is 5.
 */
public class Find_All_Disappeared_Number_In_The_Given_Array {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,4};
        List<Integer> missingNumberList = missingNumbers(a);
        for(Integer list : missingNumberList){
            System.out.println("Missing Number from Array .... : "+ list);
        }
    }

    private static List<Integer> missingNumbers(int[] a) {

        for(int i=0;i<a.length;i++){
            int index = Math.abs(a[i] -1 );
            if(a[index] > 0 ){
                a[index] = -1 * a[index];
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<a.length;i++){
            if(a[i] > 0){
                list.add(i+1);
            }
        }
        return list;
    }
}
