package io.dowlath.dsa.leetcode.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*
        O/P :

        Given List ....  :
        2 -> 1 -> 5 -> null
        Next Greater Node ....  :
        [5, 5, 0]

 */
public class Next_Greater_Node {
    private ListNode head;
    public static class ListNode{
        private int data;
        private ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }


    public ListNode reverseList(ListNode head){
        ListNode output = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = output;
            output = head;
            head = temp;
        }
        return output;
    }

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current  = current.next;
        }
        System.out.println("null");
    }

    private static int[] nextGreaterNode(ListNode head) {
        List<Integer> first = new ArrayList<>();
        while(head != null){
           first.add(head.data);
           head = head.next;
        }
        int[] output = new int[first.size()];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<first.size();i++){
            while(!stack.isEmpty() && first.get(stack.peek()) < first.get(i)){
                output[stack.pop()] = first.get(i);
            }
            stack.add(i);
        }
        return output;
    }
    public static void main(String[] args) {
        Next_Greater_Node nextGreaterNode = new Next_Greater_Node();
        nextGreaterNode.insertLast(2);
        nextGreaterNode.insertLast(1);
        nextGreaterNode.insertLast(5);
        System.out.println("Given List ....  : ");
        nextGreaterNode.display();
        System.out.println("Next Greater Node ....  : ");
        int[] result = nextGreaterNode(nextGreaterNode.head);
        System.out.println(Arrays.toString(result));
    }


}
