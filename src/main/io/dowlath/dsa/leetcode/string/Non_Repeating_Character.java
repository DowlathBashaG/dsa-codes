package io.dowlath.dsa.leetcode.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class Non_Repeating_Character {
    public static void main(String[] args) {
        String s = "Haappyy";
        char firstChar = firstNonRepeatedCharacter(s);
        System.out.println("First Non Repeated Character ... : "+ firstChar);
    }

    private static char firstNonRepeatedCharacter(String s) {
        Map<Character,Integer> chars = new LinkedHashMap<Character, Integer>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            chars.compute(ch,(k,v) -> (v == null) ?  1 : ++v);
        }
        for(Map.Entry<Character,Integer> entry : chars.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return Character.MIN_VALUE;
    }
}
