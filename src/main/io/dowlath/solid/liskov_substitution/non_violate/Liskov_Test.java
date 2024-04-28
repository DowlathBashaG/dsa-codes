package io.dowlath.solid.liskov_substitution.non_violate;

class Bird{
    public void Eat() {
        System.out.println("This bird can eat.");
    }
}
class FlyingBird extends Bird{
    public void fly() {
        System.out.println("This bird can fly.");
    }
}

class Parrot extends FlyingBird {
}

class Penguin extends Bird{
}

public class Liskov_Test {
}
