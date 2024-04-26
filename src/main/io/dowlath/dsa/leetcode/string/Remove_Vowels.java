package io.dowlath.dsa.leetcode.string;
/*
       O/P :  Vowels .... : DwlthBshG
 */
public class Remove_Vowels {
    public static void main(String[] args) {
        String s = "DowlathBashaG";
        System.out.println("Vowels .... : "+removeVowels(s));
    }

    private static String removeVowels(String s) {
        StringBuilder output = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                continue;
            }
            output.append(c);
        }
        return output.toString();
    }
}
