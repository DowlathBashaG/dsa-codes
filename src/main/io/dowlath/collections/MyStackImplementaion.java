package io.dowlath.collections;

import java.util.Arrays;

public class MyStackImplementaion {
    private int maxSize;
    private long[] myStack;
    private int top;
    public MyStackImplementaion(int i){
    	maxSize = i;
    	myStack = new long[maxSize];
    	top--;
    }
    public void push(int i){
    	myStack[++top]=i;
    }
    public long pop(){
    	return myStack[top--];
    }
    public long peek(){
    	return myStack[top];
    }
    public boolean isEmpty(){
    	return (top == -1);
    }
    public boolean isFull(){
    	return (top == maxSize-1);
    }
    public static void main(String args[]){
    	MyStackImplementaion stack = new MyStackImplementaion(5);
    	stack.push(100);
    	stack.push(200);
    	stack.push(300);
    	stack.push(400);
    	stack.push(500);
    	System.out.println("Elements are ...: "+stack);
    	while(!stack.isEmpty()){
    		long value = stack.pop();
    		System.out.println(value);
    	}
    	System.out.println(stack.isEmpty());
    }
	@Override
	public String toString() {
		return "MyStackImplementaion [maxSize=" + maxSize + ", myStack=" + Arrays.toString(myStack) + ", top=" + top
				+ "]";
	}
    
}
