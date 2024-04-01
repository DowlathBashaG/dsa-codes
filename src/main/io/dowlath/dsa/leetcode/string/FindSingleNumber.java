package io.dowlath.dsa.leetcode.string;

/*

      XOR ^

      4 ^ 1 ^ 2 ^ 1 ^2    ....
      4 ^ ( 1 ^ 1 ) ^ (2  ^ 2)  =>  4 ^ (0) ^ (0) => 4 ^ 0 => 4

      Answer is ... : 4

 */
public class FindSingleNumber {
    public static void main(String[] args) {
        int[] a = {4,1,2,1,2};
        int n = findSingleNumber(a);
        System.out.println("Single number ... : "+ n);
    }

    private static int findSingleNumber(int[] a) {
        int singleNum = 0;
        for(int num : a){
            singleNum = singleNum ^ num;
        }
        return singleNum;
    }
}
