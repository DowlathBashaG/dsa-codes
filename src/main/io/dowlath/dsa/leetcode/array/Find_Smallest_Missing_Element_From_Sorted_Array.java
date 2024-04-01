package io.dowlath.dsa.leetcode.array;

/*
      I/P :

          nums[] = { 0,1,2,3,4,5,6 }

      O/P :

          The smallest missing element is 7
 */
public class Find_Smallest_Missing_Element_From_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = { 0,1,2,3,4,5,6 };
        int left = 0, right = nums.length-1;
        System.out.println("The smallest missing element is .... : "+ findSmallestMissing(nums,left,right));
    }

    private static int findSmallestMissing(int[] nums, int left, int right) {
        if ( left > right){
            return left;
        }
        int mid = left + (right - left ) /2 ;

        if(nums[mid] == mid){
            return findSmallestMissing(nums,mid+1,right);
        } else {
            return findSmallestMissing(nums,left,mid-1);
        }
    }
}
