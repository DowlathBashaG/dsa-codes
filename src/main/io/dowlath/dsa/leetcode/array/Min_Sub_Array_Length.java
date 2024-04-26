package io.dowlath.dsa.leetcode.array;
/*
    O/P :
            Minimum Sub-Array Length ... : 2
 */
public class Min_Sub_Array_Length {
    public static void main(String[] args) {
        int[] a = {2,3,1,2,4,3};
        int s = 7;
        System.out.println("Minimum Sub-Array Length ... : "+ minSubArrayLength(s,a));
    }

    private static int minSubArrayLength(int s, int[] a) {
        if(a == null || a.length == 0) return 0;
        int len = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;
        for(int i =0;i<a.length;i++){
            sum+=a[i];
            while(sum >= s){
                len = Math.min(len,i-start+1);
                sum-=a[start];
                start++;
            }
        }
        if(len == Integer.MAX_VALUE) return 0;
        return len;
    }
}
