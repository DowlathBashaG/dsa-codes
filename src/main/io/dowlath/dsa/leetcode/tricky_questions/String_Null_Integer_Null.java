package io.dowlath.dsa.leetcode.tricky_questions;

public class String_Null_Integer_Null {
    public static void main(String[] args) {
        Integer i = new Integer(null);

        //1.
        //String s = new String(null);  // compiler will give compile time error because
        // string constructor we are passing 3 classes like StringBuilder, StringBuffer and String.
        // so, compiler will difficult to understand which class it seems to null; so it is giving error

        //2.
        System.out.println(i.intValue()); // it gives number format exception because null to parseInt is giving
        // number format exception.
        /*
        Exception in thread "main" java.lang.NumberFormatException: Cannot parse null string
        at java.base/java.lang.Integer.parseInt(Integer.java:630)
        at java.base/java.lang.Integer.<init>(Integer.java:1127)
        at io.dowlath.dsa.leetcode.tricky_questions.String_Null_Integer_Null.main(String_Null_Integer_Null.java:5)
         */
    }
}
