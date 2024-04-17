package io.dowlath.dsa.leetcode.pascal_triangle;

import java.util.ArrayList;
import java.util.List;

/*
       I/P :  5
       O/P : [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        int noOfRows = 5;
        List<List<Integer>> result = generateTriangle(noOfRows);
        System.out.println(result);
    }

    private static List<List<Integer>> generateTriangle(int noOfRows) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        for(int i = 0;i<noOfRows;i++){
            current.add(0,1);
            for(int x = 1;x<current.size()-1;x++){
                current.set(x,current.get(x) + current.get(x+1));
            }
            output.add(new ArrayList<>(current));
        }
        return output;
    }
}
