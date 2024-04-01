package io.dowlath.dsa.leetcode.string;

import java.util.Arrays;
import java.util.List;

public class Word_Break {
    public static void main(String[] args) {
        List<String> dict = Arrays.asList("This","is","break");
        String word = "break";
        wordBreak(dict,word,"");
    }

    private static void wordBreak(List<String> dict, String word, String out) {

        if(word.length() == 0){
            System.out.println(out);
            return;
        }
        for(int i=1;i<=word.length();i++){
            String prefix = word.substring(0,i);
            if(dict.contains(prefix)){
                wordBreak(dict,word.substring(i),out+" "+prefix);
            }
        }
    }
}
