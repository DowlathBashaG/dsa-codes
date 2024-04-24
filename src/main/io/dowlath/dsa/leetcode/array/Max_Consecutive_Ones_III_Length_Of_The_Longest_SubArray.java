package io.dowlath.dsa.leetcode.array;

/*
      O/P :

      The Length_Of_The_Longest_SubArray ... : 6
 */

public class Max_Consecutive_Ones_III_Length_Of_The_Longest_SubArray {
    public static void main(String[] args) {
        int[] a = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println("The Length_Of_The_Longest_SubArray ... : "+longestOnes(a,k));
    }

    private static int longestOnes(int[] a, int k) {
        int left = 0;
        int right = 0;

        while(right < a.length){
            if(a[right] == 0) k--;
            if(k < 0){
                if(a[left] == 0) k++;
                left++;
            }
            right++;
        }
        return right - left;
    }
}
