package io.dowlath.dsa.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] a = { 2,7,11,15};
        int target = 9;
        int[] result = twoSum(a,target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSum(int[] a,int target) {
       int[] ans = new int[2];
       Map<Integer,Integer> map = new HashMap<>();
       for(int i = 0;i<a.length;i++){
           int diff = target - a[i];
           if(map.containsKey(diff)){
               ans[0] = i;
               ans[1] = map.get(diff);
           } else {
               map.put(a[i],i);
           }
       }
       return ans;
    }
}
