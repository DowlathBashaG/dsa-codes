package io.dowlath.dsa.leetcode.important_qns;

import java.util.HashMap;

public class Find_Duplicate {
    // Time complexity: O(n)
    // Space complexity: O(n)

    static int findDuplicate(int[] arr){
        HashMap<Integer,Boolean> visited = new HashMap();
        for(int element : arr){
            if(visited.containsKey(element)) return element;
            else visited.put(element, true);
        }
        return 0;
    }
    public static void main(String[] args) {
      int[] a = { 1,2,3,4,3,5};
        System.out.println(findDuplicate(a));

    }
}
