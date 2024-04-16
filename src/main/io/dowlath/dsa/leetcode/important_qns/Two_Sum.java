package io.dowlath.dsa.leetcode.important_qns;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    public static void main(String[] args) {
        int[] a = {2,7,11,15};
        int target = 9;
        int[] res = twoSum(a,target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] twoSum(int[] a,int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            int diff = target - a[i];
            if(map.containsKey(diff)){
                result[0] = i;
                result[1] = map.get(diff);
            } else{
                map.put(a[i],i);
            }
        }
        return result;
    }
}
