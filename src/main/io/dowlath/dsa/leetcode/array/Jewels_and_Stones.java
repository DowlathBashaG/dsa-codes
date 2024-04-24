package io.dowlath.dsa.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/*
     O/P : This many stones are in the jewels ... : 3
 */
public class Jewels_and_Stones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println("This many stones are in the jewels ... : "+numJewelsInStones(jewels,stones));
    }

    private static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for (char c : jewels.toCharArray()) set.add(c);

        for (char c : stones.toCharArray()) {
            if (set.contains(c)) count++;
        }
        return count;
    }
}
