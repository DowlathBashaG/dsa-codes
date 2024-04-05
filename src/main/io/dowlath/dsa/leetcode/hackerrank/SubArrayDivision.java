package io.dowlath.dsa.leetcode.hackerrank;

import java.util.ArrayList;

/*
        I/P   :   [2,2,1,3,2]
        O/P   :   2
 */
public class SubArrayDivision {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        s.add(2);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);
        int d = 4;
        int m = 2;
        System.out.println(birthday(s,d,m));

    }

    private static int birthday(ArrayList<Integer> s, int d, int m) {
        int count = 0;
        for(int i=0; i<=s.size()-m; i++){
            int sum =0;
            for(int j=i; j<i+m; j++){
                sum = sum +s.get(j);
            }
            if(sum == d ){
                count++;
            }
        }
        return count;
    }

}
