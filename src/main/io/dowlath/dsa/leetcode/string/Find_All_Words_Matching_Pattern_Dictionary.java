package io.dowlath.dsa.leetcode.string;
/*
      dict = [ Hi, HiBro, HiFriends, HiTech, HelloWord ]

      I/P :
             pattern = "Hi"

      O/P :


 */

import java.util.*;

import static io.dowlath.dsa.leetcode.string.Find_All_Words_Matching_Pattern_Dictionary.Core.findAllWords;

public class Find_All_Words_Matching_Pattern_Dictionary {

    static class Node{
        Map<Character,Node> map = new HashMap<>();
        boolean isLeaf = false;
        Set<String> word = new HashSet<>();
    }

    static class Core {
        public static Node insert(Node head, String word) {
            if (head == null) {
                head = new Node();
            }
            Node current = head;
            for (char c : word.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    current.map.putIfAbsent(c, new Node());
                    current = current.map.get(c);
                }
            }

            current.isLeaf = true;
            (current.word).add(word);
            return head;
        }

        public static void printAllWords(Node root) {
            if (root == null) {
                return;
            }
            if (root.isLeaf) {
                System.out.println(root.word);
            }
            for (Map.Entry<Character, Node> pair : root.map.entrySet()) {
                Node child = pair.getValue();
                printAllWords(child);
            }
        }

        public static void findAllWords(List<String> dict, String pattern) {
            if (dict.size() == 0) {
                return;
            }
            Node head = null;
            for (String s : dict) {
                head = insert(head, s);
            }
            Node current = head;
            for (char c : pattern.toCharArray()) {
                current = current.map.get(c);
                if (current == null) {
                    return;
                }
            }
            printAllWords(current);
        }
    }
    public static void main(String[] args) {
        List<String> dict = null;
        dict = Arrays.asList("Hi", "HiBro", "HiFriends", "HiTech", "HelloWord");
        String pattern = "Hi";
        findAllWords(dict,pattern);
    }
}
