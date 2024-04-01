package io.dowlath.dsa.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/*
       a = { 1,2,2,3,4,1}  => 2 1
 */
public class Find_Duplicates_From_Given_Array {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,4,4};
        List<Integer> resultList = findDuplicates(a);
        for(Integer i : resultList) {
            System.out.print(i+ "  ");
        }
    }

   private static List<Integer> findDuplicates(int[] a) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            int index = Math.abs(a[i] -1);
            if(a[index] <0 ){
                list.add(a[i]);
            }
            if(a[index] > 0){
                a[index] = -1 * a[index];
            }
        }
        return list;
    }

}
