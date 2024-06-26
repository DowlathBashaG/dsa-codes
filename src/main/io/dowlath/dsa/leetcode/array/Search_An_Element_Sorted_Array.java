package io.dowlath.dsa.leetcode.array;

/*
     I/P :

     numbs : [ 9,10,2,5,6,8 ]
     target : 5

     O/P : Element found at index 3
 */
public class Search_An_Element_Sorted_Array {
    public static void main(String[] args) {
        int[] nums  = {9,10,2,5,6,8};
        int key = 5;
        int index = searchElement(nums,key);
        System.out.println("Element found at index ... : "+ index);
    }

    private static int searchElement(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left<=right){

           int mid = (left + right)/2;

           if(target == nums[mid]){
               return mid;
           }

           if(nums[mid] <= nums[right]){

                if(target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
           } else {
               if(target >= nums[left] && target < nums[mid]){
                   right = mid -1;
               } else{
                   right = mid +1;
               }
           }
        }
        return -1;
    }
}
