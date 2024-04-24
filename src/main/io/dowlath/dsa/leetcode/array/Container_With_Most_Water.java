package io.dowlath.dsa.leetcode.array;

/*
      O/P :  Max Area ... : 49
 */
public class Container_With_Most_Water {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = maxAreaWater(height);
        System.out.println("Max Area ... : "+ maxArea);
    }

    private static int maxAreaWater(int[] height) {
        int water= 0;
        int left = 0;
        int right = height.length-1;

        while(left<right){
            int leftMax = height[left];
            int rightMax = height[right];
            water = Math.max(water,(right-left) * Math.min(leftMax,rightMax));
            if( leftMax <= rightMax){
                while(left < right && leftMax >= height[left]) left++;
            } else {
                while(left < right && rightMax >= height[right]) right--;
            }
        }
        return water;
    }

}
