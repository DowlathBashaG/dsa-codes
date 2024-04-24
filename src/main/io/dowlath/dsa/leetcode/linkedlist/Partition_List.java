package io.dowlath.dsa.leetcode.linkedlist;

import java.util.List;

public class Partition_List {
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

    public ListNode partition(ListNode head,int x){
        ListNode first = new ListNode(0);
        ListNode f = first;
        ListNode second = new ListNode(0);
        ListNode s = second;

        while(head != null){
            if(head.data < x){
                f.next = head;
                f = f.next;
            } else {
                s.next = head;
                s = s.next;
            }
            head = head.next;
        }
        s.next = null;
        f.next = second.next;
        return first.next;
    }


    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current  = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Partition_List pl = new Partition_List();
        pl.insertLast(1);
        pl.insertLast(4);
        pl.insertLast(3);
        pl.insertLast(2);
        pl.insertLast(5);
        pl.insertLast(2);
        int x = 3;
        System.out.println("Given List ....  : ");
        pl.display();
        System.out.println("After Partition List of Nodes....  : ");
        ListNode tmp = pl.partition(pl.head,x);
        pl.head = tmp;
        pl.display();
    }
}
