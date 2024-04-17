package io.dowlath.dsa.leetcode.important_qns;

public class BadVersionControl {
    public static void main(String[] args) {
        int n = 5;
        int bad = 4;
        System.out.println(firstBadVersion(n));
    }

    private static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while(start < end){
            int mid = start + (end-start) / 2;
            if(isBadVersion(mid)){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        if(isBadVersion(start)) return start;
        return -1;
    }

    private static boolean isBadVersion(int mid) {
        if(mid == 3 ) {
            return false;
        }
        else if (mid == 4 || mid == 5){
            return true;
        }
        return false;
    }
}
