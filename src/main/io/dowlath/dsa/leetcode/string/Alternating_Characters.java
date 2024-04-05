package io.dowlath.dsa.leetcode.string;
/*
        I/P :  AABAAB
        O/P :  2

        We need ABAB if we remove 2 characters will get ABAB.
 */

public class Alternating_Characters {
    public static void main(String[] args) {
        String s = "AABAAB";
        System.out.println(alternateCharacter(s));
    }

    private static int alternateCharacter(String s) {
        int count = 0;
        for(int i = 1; i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
        }
        return count;
    }
}
