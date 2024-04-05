package io.dowlath.dsa.leetcode.string;

/*
       I/P   :  madam
       O/P   :  m  a
 */
public class FindDuplicatesFromGivenString {
    public static void main(String[] args) {
        String s = "madam";
        char[] c = s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            for(int j = i+1; j<s.length(); j++)
            {
                if(c[i] == c[j]){
                    System.out.print("  "+ c[j]);
                    break;
                }
            }
        }
    }
}
