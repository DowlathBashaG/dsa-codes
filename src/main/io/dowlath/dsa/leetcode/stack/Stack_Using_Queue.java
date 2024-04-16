package io.dowlath.dsa.leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;

public class Stack_Using_Queue {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();
        static int current_size;

        void push(int x) {
            q2.add(x);
            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }

         void pop() {
            if (q1.isEmpty())
                return;
            q1.remove();
        }

         int top() {
            if (q1.isEmpty())
                return -1;
            return q1.peek();
        }

         int size() {
            return q1.size();
        }

    }

    public static void main(String[] args) {
       Stack stack = new Stack();
       stack.push(1);
       stack.push(2);
       stack.push(3);

        System.out.println("Current Size ... : "+ stack.size());
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        System.out.println("Current Size ... :"+ stack.size());
    }
}
