package io.dowlath.solid.liskov_substitution.violate;

/*
      The Penguin class overrides the fly() method from the base class,
      but the behavior is fundamentally different from what’s expected
      by the base class. This is an LSP violation because when we try
      to substitute an instance of Penguin for a generic Bird, it will
      not behave as a typical bird in terms of flying.
      This could lead to unexpected behavior in the code.
 */
class Bird {
    public void Eat() {
        System.out.println("This bird can eat.");
    }

    public void fly() {
        System.out.println("This bird can fly.");
    }
}
class Parrot extends Bird {
}

class Penguin extends Bird {
    @Override
    public void fly() {
       // throw new FlyException("Penguins cannot fly");
    }
}
public class Liskov_Test {

}
