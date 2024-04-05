package io.dowlath.dsa.leetcode.hackerrank;

/*
     Alternating Characters :

     I/P    :   AABAABAAB
     O/P    :   3

     How it is ,

     AAB , AAB ,  AAB
 */
public class AlternatingCharacters {
    public static void main(String[] args) {
        String s = "AABAABAAB";
        System.out.println(alternatingCharacters(s));
    }

    private static int alternatingCharacters(String s) {
        int count = 0;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1))
            {
                count++;
            }
        }
        return count;
    }
}
