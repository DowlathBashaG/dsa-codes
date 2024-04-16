package io.dowlath.dsa.leetcode.array;

import java.util.Arrays;

public class Two_Sum_Return_Indices {
    public static void main(String[] args) {
        int[] a = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(a,target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSum(int[] a, int target) {
     int[] output = new int[2];
     int start = 0;
     int end = a.length-1;
     while(start < end){
         int sum = a[start] + a[end];
         if(sum == target){
             output[0] = start+1;
             output[1] = end+1;
             return output;
         } else if(sum > target){
             end--;
         } else{
             start++;
         }
     }

     return output;
    }
}
