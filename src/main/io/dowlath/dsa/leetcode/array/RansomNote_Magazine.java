package io.dowlath.dsa.leetcode.array;

/*
1.
      ransomNote = "bad"
      magazine = "abcd"

      Result = True

2.
      ransomNote = "code"
      magazine = "abcodf"

      Result = false

 */
public class RansomNote_Magazine {
    public static void main(String[] args) {
        String ransomNote = "bad";
        String magazine = "abcd";
        boolean canConstruct = canConstruct(ransomNote,magazine);
        System.out.println("Result .... : "+ canConstruct);
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        int[] frequency = new int[26];
        for(int i=0;i<magazine.length();i++){
            char c = magazine.charAt(i);
            frequency[c - 'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            if(frequency[ c -'a'] == 0 ) return false;
            frequency[c-'a']--;
        }
        return true;
    }

}
