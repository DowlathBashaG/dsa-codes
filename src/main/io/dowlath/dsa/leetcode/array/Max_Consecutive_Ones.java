package io.dowlath.dsa.leetcode.array;

public class Max_Consecutive_Ones {
    public static void main(String[] args) {
        int[] a = {1,0,1,1,0,1};
        System.out.println("The max consecutive one's are ... : " +maxConsecutiveOnes(a));
    }

    private static int maxConsecutiveOnes(int[] a) {
        int max = 0;
        int start = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i] == 1){
                max = Math.max(max,i-start+1);
            } else {
                start = i+1;
            }
        }
        return max;
    }
}
