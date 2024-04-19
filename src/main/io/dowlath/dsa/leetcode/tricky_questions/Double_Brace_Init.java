package io.dowlath.dsa.leetcode.tricky_questions;

import java.util.HashSet;
import java.util.Set;

public class Double_Brace_Init {
    public static void main(String[] args) {
        Set<String> validCode1 = new HashSet<>();
        validCode1.add("QA");
        validCode1.add("Dev");

        System.out.println("Valid code ...:  "+ validCode1 );

        System.out.println("Using double braces initialization ");
        // 1. First Brace will create for ananymous class
        // 2. Second Brace will add the values

        Set<String> validCode2 = new HashSet<String>(){
            {
              add("QA");
              add("Dev");
            }

        };
        System.out.println(validCode2);
    }
}
