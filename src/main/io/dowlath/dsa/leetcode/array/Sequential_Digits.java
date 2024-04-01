package io.dowlath.dsa.leetcode.array;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Sequential_Digits {
    public static void main(String[] args) {
        int low = 100;
        int high = 300;
        List<Integer> sequentialList = sequentialList(low,high);
        for(Integer list : sequentialList){
            System.out.print(list +" ");
        }
    }

    private static List<Integer> sequentialList(int low, int high) {
        String str = "123456789";
        List<Integer> list = new ArrayList<>();
        for(int i=1; i <= 9; i++){
            for(int j=0; i+j <= 9; j++){
                String tmp = str.substring( j, i+j );
                int val = Integer.valueOf(tmp);
                if( val >= low && val <= high ){
                    list.add(val);
                }
            }
        }
        return list;
    }
}
