package io.dowlath.dsa.leetcode.array;

import java.util.Arrays;

/*
     I/P :  {-1,2,1,-4};
            target = 1

            -1+2+1 => 2 it is closest to target ie. 1.

     O/P : The closest sum ... : 2
 */
public class Three_Sum_Closest {
    public static void main(String[] args) {
        int[] a = {-1,2,1,-4};
        int target = 1;
        int closestSum = closestSum(a,target);
        System.out.println("The closest sum ... : "+ closestSum);
    }

    private static int closestSum(int[] a, int target) {
        int closestSum = a[0] + a[1] + a[a.length-1];
        Arrays.sort(a);
        for(int i=0;i<a.length-2;i++){
            int start = i+1;
            int end = a.length-1;
            while(start < end){

                int cur = a[i] + a[start] + a[end];
                if(Math.abs(target - cur) < Math.abs(target - closestSum)){
                  closestSum = cur;
                }

                if(cur == target) return target;
                if(cur > target){
                    end--;
                } else {
                    start++;
                }
            }
        }
        return closestSum;
    }
}
