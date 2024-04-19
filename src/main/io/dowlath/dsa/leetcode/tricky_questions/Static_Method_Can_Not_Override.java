package io.dowlath.dsa.leetcode.tricky_questions;

/*
      if we call,

      cat.meow();
      kitten.meow();

      prints output like,

      Parent Cat Meow
      Parent Cat Meow

      Because static method can not overriden, if you remove static keyword it will print kitten meow method.

 */
class Cat{
    public static void meow(){
        System.out.println("Parent Cat Meow");
    }
}
class Kitten extends Cat{
    public static void meow(){
        System.out.println("Child Kitten Meow");
    }
}
public class Static_Method_Can_Not_Override {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat kitten = new Kitten();
        cat.meow();
        kitten.meow();
    }


}
