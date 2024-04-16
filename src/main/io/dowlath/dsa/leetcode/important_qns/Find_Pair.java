package io.dowlath.dsa.leetcode.important_qns;

import java.util.HashMap;

public class Find_Pair {

    static boolean findPair(int[] arr, int k){
        HashMap<Integer,Boolean> visited = new HashMap<Integer,Boolean>();
        for(int element : arr){
            if(visited.containsKey(k-element)) return true;
            else visited.put(element, true);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a = {4,5,1,-3,6};  // 5+6-> 11
        int k = 11;
        if(findPair(a,k)){
            System.out.println("True..... it contains two sum pair");
        } else {
            System.out.println("False.... it is not two sum pair");
        }
    }
}
