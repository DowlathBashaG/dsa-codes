package io.dowlath.dsa.leetcode.stack;

public class Stack_Using_Array {
    private int top;
    private int[] a;

    public Stack_Using_Array(int capacity){
        top = -1;
        a= new int[capacity];
    }

    public Stack_Using_Array(){
        this(10);
    }

    public void push(int data){
        if(isFull()){
            throw new RuntimeException("Stack is full !!!!");
        }
        top++;
        a[top] = data;
    }
    public boolean isFull(){
        return a.length == size();
    }

    public int size(){
        return top+1;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty !!!");
        }
        int result = a[top];
        top--;
        return result;
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty !!!");
        }
        return a[top];
    }
    public boolean isEmpty(){
        return top < 0;
    }

    public static void main(String[] args) {
        Stack_Using_Array stack = new Stack_Using_Array();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
    }
}
