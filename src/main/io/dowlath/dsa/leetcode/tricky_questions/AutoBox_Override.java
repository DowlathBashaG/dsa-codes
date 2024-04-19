package io.dowlath.dsa.leetcode.tricky_questions;

/*
          O/P :

            Parent.init
            Parent.init
            Child Integer
            Parent.init


 */

class Parent{
    void method(int i){
        System.out.println("Parent.init");
    }
}
class Child extends Parent{
    void method(Integer i){
        System.out.println("Child Integer");
    }
}
public class AutoBox_Override {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.method(new Integer(10));
        parent.method(10);

        Child child = new Child();
        child.method(new Integer(10));
        child.method(10);
    }
}
