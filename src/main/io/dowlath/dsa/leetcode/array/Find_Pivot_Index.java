package io.dowlath.dsa.leetcode.array;
/*
    O/P :  Pivot Index .... : 3
 */
public class Find_Pivot_Index {
    public static void main(String[] args) {
        int[] a = {1,7,3,6,5,6};
        System.out.println("Pivot Index .... : "+ pivotIndex(a));
    }

    private static int pivotIndex(int[] a) {
        int totalSum = 0;
        for(int i : a) totalSum += i;
        int accSum = 0;
        for(int i=0;i<a.length;i++){
            if((totalSum - a[i] - accSum) == accSum) return i;
            accSum += a[i];
        }
        return -1;
    }
}
