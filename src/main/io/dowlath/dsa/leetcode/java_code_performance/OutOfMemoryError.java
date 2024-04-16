package io.dowlath.dsa.leetcode.java_code_performance;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryError {
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        Integer[] array = new Integer[10000 * 10000];
    }
}
