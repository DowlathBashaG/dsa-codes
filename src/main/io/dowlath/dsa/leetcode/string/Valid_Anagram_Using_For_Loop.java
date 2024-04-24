package io.dowlath.dsa.leetcode.string;
/*
      O/P : Is it valid anagram or not (if it is true valid else it is false.... : true
 */
public class Valid_Anagram_Using_For_Loop {
    public static void main(String[] args) {
        String s = "anagram"; // "rat";
        String t = "nagaram"; // "car";
        System.out.println("Is it valid anagram or not (if it is true valid else it is false.... : "+isAnagram(s,t));
    }

    private static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] table = new int[26];

        for(char c : s.toCharArray()){
            table[c-'a']++;
        }
        for(char c : t.toCharArray()){
            table[c-'a']--;
        }
        for(int i : table){
            if(i != 0) return false;
        }
        return true;
    }
}
