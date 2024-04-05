package io.dowlath.dsa.leetcode.hackerrank;

/*

 */
public class ViralAdvertising {
    public static void main(String[] args) {
        int n = 4;
        int total = viralAdvertising(n);
        System.out.println(total);
    }
    static int viralAdvertising(int n){
        int shared = 5;
        int like = 0;
        int total = 0;
        for(int i=1; i<=n; i++)
        {
            like = shared / 2;
            total = total + like;
            shared = like * 3;
        }
        return total;
    }

}
