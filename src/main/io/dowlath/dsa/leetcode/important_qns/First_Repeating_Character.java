package io.dowlath.dsa.leetcode.important_qns;

import java.util.HashMap;

public class First_Repeating_Character {
    static char firstRepeatingCharacter(String str){
        HashMap<Character,Boolean> visited = new HashMap();
        char[] characters = str.toCharArray();
        for(char ch : characters){
            if(visited.containsKey(ch)) return ch;
            else visited.put(ch, true);
        }
        return '\0';
    }

    public static void main(String[] args) {
        String s = "Dowlath Basha G";
        System.out.println(firstRepeatingCharacter(s));
    }
}
