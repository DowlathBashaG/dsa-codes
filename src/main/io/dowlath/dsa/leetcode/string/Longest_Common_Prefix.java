package io.dowlath.dsa.leetcode.string;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] s = {"flower","flow","flight"};
        String  longestCommonPrefix = longestCommonPrefix(s);
        System.out.println("Longest Common Prefix .... : "+ longestCommonPrefix);
    }

    private static String longestCommonPrefix(String[] s) {
        if(s.length ==0) return "";
         String prefix = s[0];
        for(int i=0;i<s.length;i++){
            while(s[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
