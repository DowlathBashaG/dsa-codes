package io.dowlath.dsa.leetcode.problemsolving;

/*
     Success Case :
       int[] rec1 = {0,0,2,2};  // [ x1, y1, x2, y2 ]
       int[] rec2 = {1,1,3,3};  // [ x1, y1, x2, y2 ]

     Failure Case :
       int[] rec1 = {0,0,1,1};  // [ x1, y1, x2, y2 ]
       int[] rec2 = {1,0,2,1};  // [ x1, y1, x2, y2 ]
 */
public class Rectangle_Overlapping {
    public static void main(String[] args) {
        int[] rec1 = {0,0,2,2};  // [ x1, y1, x2, y2 ]
        int[] rec2 = {1,1,3,3};  // [ x1, y1, x2, y2 ]
        /*
             (x1,y1)  ->  bottom left
             (x1,y2)  ->  top left
             (x2,y1)  ->  bottom right
             (x2.y2)  ->  top right

             Main Formula :
             left1 < right2  && left2 < right1

         */
        boolean isItOverlapping = isRectanlgeOverlapping(rec1,rec2);
        System.out.println("The Given Rectangle is it overlapping... : "+ isItOverlapping);
    }

    private static boolean isRectanlgeOverlapping(int[] rec1, int[] rec2) {
        /*
            Apply this formula:

            Main Formula :
            left1 < right2  && left2 < right1

         */
        // x -> axis : 0,2 , y -> axis : 1,3
        return // for x - axis
        rec1[0] < rec2[2] &&
        rec2[0] < rec1[2] &&
        rec1[1] < rec2[3] &&
        rec2[1] < rec2[3] ;
    }
}
