package io.dowlath.dsa.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/*
       I/P :
            racecars

       O/P : Non Repeating Character Index ... : 3    (ie 'e')

 */
public class First_Non_Repeating_Character_Easy_Way {
    public static void main(String[] args) {
        String s = "racecars";
        int nonRepeatCharacterIndex = nonRepeatCharacterIndex(s);
        System.out.println("Non Repeating Character Index ... : "+ nonRepeatCharacterIndex);
    }

    private static int nonRepeatCharacterIndex(String s) {
        Map<Character,Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();

        for(char ch : chars){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<chars.length;i++){
            char ch = chars[i];
            if(map.get(ch) == 1 ){
                return i;
            }
        }
        return -1;
    }
}
