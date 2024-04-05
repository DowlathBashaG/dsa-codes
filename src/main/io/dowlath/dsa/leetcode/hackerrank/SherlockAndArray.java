package io.dowlath.dsa.leetcode.hackerrank;

import java.util.ArrayList;

/*
        I/P   : 1 1 4 1
        O/P   :  NO
 */
public class SherlockAndArray {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        System.out.println(balancedSums(ar));
    }

    private static String balancedSums(ArrayList<Integer> ar) {
        int totalSum = 0;
        int leftSum = 0;
        int rightSum = 0;

        for(int i = 0; i<ar.size(); i++){
            totalSum = totalSum + ar.get(i);
        }

        for(int i=0; i<ar.size();i++){
            rightSum = totalSum - ar.get(i) - leftSum;
            if(leftSum == rightSum){
                return "YES";
            }else{
                leftSum = leftSum + ar.get(i);
            }
        }
        return "NO";
    }
}
