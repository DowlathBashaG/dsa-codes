package io.dowlath.dsa.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class Find_Pairs_With_Difference_K_In_An_Array {
    public static void main(String[] args) {
        int[] A = {1,5,2,2,2,2,5,5,4};
        int diff = 3;
        findPair(A,diff);
    }

    private static void findPair(int[] A, int diff) {
        Set<Integer> set = new HashSet<>();
        for(int i : A){
            if(set.contains(i-diff)){
                System.out.println("("+i+","+(i-diff)+")");
            }
            if(set.contains(i+diff)){
                System.out.println("("+(i+diff)+","+i+")");
            }
            set.add(i);
        }
    }
}
