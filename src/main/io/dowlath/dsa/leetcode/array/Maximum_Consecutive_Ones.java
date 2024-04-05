package io.dowlath.dsa.leetcode.array;

import java.util.Arrays;

/*
     I/P :   a[] =  {0,1,1,0,0,1,1,1,0}

     O/P :    3


     Given Array.... :
                        [0, 1, 1, 0, 0, 1, 1, 1, 0]
                        Maximum Consecutive Ones..... : 3
 */
public class Maximum_Consecutive_Ones {
    public static void main(String[] args) {
        int[] a =  {0,1,1,0,0,1,1,1,0};
        System.out.println("Given Array.... :");
        System.out.println(Arrays.toString(a));
        //System.out.println("Maximum Consecutive Ones..... : "+ maximumConsecutiveOnes(a));
        System.out.println("Maximum Consecutive Ones..... : "+ maximumConsecutiveOnesEfficientApproach(a));
    }
  //O(n)
    private static int maximumConsecutiveOnesEfficientApproach(int[] a) {
        int maxCount = 0, count =0;
        for(int i = 0;i<a.length;i++){
            if(a[i] == 0){
                count = 0;
            } else {
                count++;
            }
            maxCount = Math.max(count,maxCount);
        }
        return maxCount;
    }
    /*
    // O(n^2)
    private static int maximumConsecutiveOnes(int[] a) {

        int maxCount = 0;
        for(int i=0;i<a.length;i++){
            int count = 0;
            for(int j = i;j<a.length;j++){
                if(a[j] == 1){
                    count++;
                } else {
                    break;
                }
            }
            maxCount = Math.max(count,maxCount);
        }
        return maxCount;
    }
    */

}
