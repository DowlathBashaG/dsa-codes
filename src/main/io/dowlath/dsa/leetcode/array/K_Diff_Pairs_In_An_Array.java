package io.dowlath.dsa.leetcode.array;

/*

      nums = [ 3,1,4,1,5 ] , k= 2    , (1,3) & (3,5)
      o/p = 2

      nums = [ 1,2,3,4,5 ] k = 1, pairs (1,2),(2,3),(3,4),(4,5)
      o/p = 4

 */

import java.util.HashMap;
import java.util.Map;

public class K_Diff_Pairs_In_An_Array {
    public static void main(String[] args) {
        int[] b = {3,1,4,1,5};
        int k = 1;
        System.out.println(findPair(b,k));
    }

    private static int findPair(int[] a, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : a){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(k ==0 ){
                if(entry.getValue() >= 2 ){
                    count++;
                }
            } else {
                if(map.containsKey(entry.getKey() + k)){
                    count++;
                }
            }
        }
        return count;
    }

}
