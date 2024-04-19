package io.dowlath.dsa.leetcode.tricky_questions;

/*
           IntegerCache class... low & high value  (-128 to 127)

           VM arguments :
           -XX:AutoBoxMaxCache<size>

           Example :
           -XX:AutoBoxMaxCache=256
 */
public class Integer_Equals {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);  // return true
        Integer i3= 128;
        Integer i4= 128;
        System.out.println(i3 == i4);  // return false ,
                                       // if you want to return true you need to set
                                       // VM arguments : -XX:AutoBoxMaxCache = 2567

    }
}
