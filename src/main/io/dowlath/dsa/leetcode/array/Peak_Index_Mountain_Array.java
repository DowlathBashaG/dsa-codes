package io.dowlath.dsa.leetcode.array;

/*
     I/P : int[] a = {0,2,1,0}; // answer is 1 because 2 is peak so 2's index is 1.
     O/P : Peak Index Mountain Array ... : 1
 */
public class Peak_Index_Mountain_Array {

    public int peakIndex(int[] a){
        int start = 0;
        int end = a.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(a[mid] < a[mid+1]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        Peak_Index_Mountain_Array peakIndexMountainArray = new Peak_Index_Mountain_Array();
        int[] a = {0,2,1,0}; // answer is 1 because 2 is peak so 2's index is 1.
        System.out.println("Peak Index Mountain Array ... : "+ peakIndexMountainArray.peakIndex(a));
    }
}
