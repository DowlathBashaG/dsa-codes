package io.dowlath.dsa.leetcode.stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(4);
        myStack.push(6);
        myStack.push(8);
        myStack.push(10);
        myStack.push(12);
        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();
        myStack.pop();
        myStack.printStack();
    }
}
