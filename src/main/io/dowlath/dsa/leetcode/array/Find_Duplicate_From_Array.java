package io.dowlath.dsa.leetcode.array;

import java.util.stream.IntStream;

public class Find_Duplicate_From_Array {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,4,5};
        //System.out.println("The duplicate element is ... : "+ findDuplicate(num));
        System.out.println("The duplicate element from brute force method  ... : "+ findDuplicate_Brute_Force(num));
    }

    private static int findDuplicate(int[] A){
        int actualSum = IntStream.of(A).sum();
        int expectedSum = A.length * (A.length-1) / 2;
        return actualSum - expectedSum;
    }

    private static int findDuplicate_Brute_Force(int[] x){
        boolean[] visited = new boolean[x.length+1];
        for(int value : x){
            if(visited[value]){
                return value;
            }
            visited[value] = true;
        }
        return -1;
    }
}
