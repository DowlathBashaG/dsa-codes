package io.dowlath.dsa.leetcode.tricky_questions;

import java.util.HashSet;
import java.util.Set;

public class FullName_Equals_Hashcode {

    private String first,last;

    public FullName_Equals_Hashcode(String first,String last){
        this.first = first;
        this.last = last;
    }

    public boolean equals(FullName_Equals_Hashcode o){
        return first.equals(o.first) && last.equals(o.last);
    }

    public int hashCode(){
        return 31 * first.hashCode() + last.hashCode();
    }

    public static void main(String[] args) {

     Set<FullName_Equals_Hashcode> s = new HashSet<>();

     s.add(new FullName_Equals_Hashcode("Dowlath","Basha"));
     System.out.println(s.contains(new FullName_Equals_Hashcode("Dowlath","Basha")));  // returns false ,
        // as per equals method obj reference is comparing. so need to do as like below.


     FullName_Equals_Hashcode f = new FullName_Equals_Hashcode("Arsh","Dowlath");
     s.add(f);
     System.out.println(s.contains(f));

    }
}
