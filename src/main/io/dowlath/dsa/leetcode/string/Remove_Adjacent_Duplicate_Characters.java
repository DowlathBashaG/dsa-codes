package io.dowlath.dsa.leetcode.string;
/*
    I/P :
        AABBCDDD

    O/P :

        ABCD
 */
public class Remove_Adjacent_Duplicate_Characters {
    public static void main(String[] args) {
        String givenString = "AABBCDDD";
        System.out.println("Removed Duplicate Characters from given string ... : "+ removeDuplicate(givenString));
    }

    private static String removeDuplicate(String s) {
        if( s == null) return null;
        char[] chars = s.toCharArray();
        char prev = 0;
        int k = 0;
        for( char c : chars){
            if (prev != c){
                chars[k++] = c;
                prev = c;
            }
        }
        return new String(chars).substring(0,k);
    }

}
