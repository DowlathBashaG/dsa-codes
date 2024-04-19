package io.dowlath.dsa.leetcode.tricky_questions;

/*
        false
        true
        false
        true
        false
        true
 */
public class Long_Double_Float_AutoBoxing_Equals {
    public static void main(String[] args) {
        Long l = new Long(0);
        System.out.println(l.equals(0)); // return false because not happening autoboxing.
                                         // it treated integer.so make it 0l or 0L
        System.out.println(l.equals(0l)); //true

        Double d = new Double(0);
        System.out.println(d.equals(0)); // return false because not happening autoboxing.
        // it treated integer.so make it 0l or 0L
        System.out.println(d.equals(0d)); //true


        Float f = new Float(0);
        System.out.println(f.equals(0)); // return false because not happening autoboxing.
        // it treated integer.so make it 0l or 0L
        System.out.println(f.equals(0f)); //true
    }
}
