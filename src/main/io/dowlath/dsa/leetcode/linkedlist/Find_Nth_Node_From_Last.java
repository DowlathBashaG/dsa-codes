package io.dowlath.dsa.leetcode.linkedlist;

public class Find_Nth_Node_From_Last {
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

    public ListNode getNthNodeFromEnd(int n){
        if(head == null){
            return null;
        }
        if( n <= 0){
            throw new IllegalArgumentException("Invalid value");
        }

        ListNode refNode = head;
        ListNode mainNode = head;
        int count = 0;
        while(count < n){
            if(refNode == null){
                throw new IllegalArgumentException(n+ " is greater than the number of nodes in list");
            }
            refNode = refNode.next;
            count++;
        }

        while(refNode != null){
            refNode  = refNode .next;
            mainNode = mainNode.next;
        }

        return mainNode;

    }
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Find_Nth_Node_From_Last fNode = new Find_Nth_Node_From_Last();
        fNode.insertLast(1);
        fNode.insertLast(2);
        fNode.display();
        ListNode nthNodeFromEnd = fNode.getNthNodeFromEnd(6);
        ListNode tmp = nthNodeFromEnd;
        System.out.println(" ");
        System.out.println(tmp.data);


    }
}
