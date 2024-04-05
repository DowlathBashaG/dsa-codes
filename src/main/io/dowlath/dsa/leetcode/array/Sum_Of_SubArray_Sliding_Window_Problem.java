package io.dowlath.dsa.leetcode.array;

/*
       I/P :   K =3 , A[] = {2,9,31,-4,21,7}
               2+9+31 , 9+31+-4  , 31+-4+21 , -4+21+7

               Size of Array - K = lenght of array for i condition.

               maximum sum is the answer. Here 48 is the answer.
       O/P :
               48

       Sum of Sub Array is : 48
 */

public class Sum_Of_SubArray_Sliding_Window_Problem {
    public static void main(String[] args) {
        int[] a = {2,9,31,-4,21,7};
        int k = 3;
        System.out.println("Sum of Sub Array is : "+ sumOfSubArrayUsingSlidingWindow(a,k));
    }

    private static int sumOfSubArrayUsingSlidingWindow(int[] a, int k) {
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;

        for(int i=0;i<k;i++){
            windowSum = windowSum + a[i];
        }

        for(int i=k;i<a.length;i++){
            windowSum = windowSum - a[i-k] + a[i];   // very very important step here this is sliding window algorithm
            maxSum = Math.max(maxSum,windowSum);
        }
        return maxSum;

    }
}
