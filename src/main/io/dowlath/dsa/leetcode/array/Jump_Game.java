package io.dowlath.dsa.leetcode.array;

public class Jump_Game {
    public static void main(String[] args) {
        int[] a = {3,2,1,0,4};
        int[] b = {2,3,1,1,4};
        boolean canJump_1  = canJump(a);
        boolean canJump_2  = canJump(b);
        System.out.println("Can Jump .... : "+ canJump_1 + "    "+ canJump_2 );
      }

    private static boolean canJump(int[] a) {
        int reachable = 0;
        for( int i =0 ;i< a.length && i<= reachable;i++){
            reachable = Math.max(reachable,i+a[i]);
            if(reachable >= a.length - 1)
                return true;
        }
        return false;
    }
}
