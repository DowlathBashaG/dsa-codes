package io.dowlath.dsa.leetcode.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
       O/P :  Most Common Word ... : ball
 */
public class Most_Common_Word {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball,, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println("Most Common Word ... : "+ mostCommonWord(paragraph,banned));
    }

    private static String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>();
        for(String s : banned) ban.add(s);

        Map<String,Integer> map = new HashMap<>();
        for(String word : paragraph.replaceAll("[^a-zA-Z]"," ").toLowerCase().split(" ")){
            if(!ban.contains(word)){
                map.put(word,map.getOrDefault(word,0)+1);
            }
        }
        map.remove(" ");
        String result = "";
        for(String key : map.keySet()){
            if(result.equals("") || map.get(key) > map.get(result)) result = key;
        }
        return result;
    }
}
