package io.dowlath.dsa.leetcode.array;

import java.util.Arrays;

/*
    I/P :

    // Sorted Array
        array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        searchElement = 2

    O/P :

       Result : 1
 */
public class Search_An_Element_Sorted_Array_Using_Arrays_BinarySearch {
    public static void main(String[] args) throws Exception{
        // Sorted Array
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int searchElement = 2;
        int index = Arrays.binarySearch(array,searchElement);
        if(index > 0){
            System.out.println("Element found at index ... : "+ index);
        } else {
            System.out.println("Element not found");
        }

    }
}
