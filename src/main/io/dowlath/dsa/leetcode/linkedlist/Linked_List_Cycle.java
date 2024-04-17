package io.dowlath.dsa.leetcode.linkedlist;

/*
      I/P  :  [ 3,2,0,-4 ]
 */
public class Linked_List_Cycle {
    private ListNode head;
     static class ListNode{
         int data;
         ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data){
        ListNode newNode = new ListNode(data);
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

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+ " ");
            current = current.next;
        }
        System.out.print("null");
    }

    public boolean hasCycle(ListNode head){
        if(head == null) return false;
        ListNode slowPtr = head;
        ListNode fastPtr = head.next;
        while(fastPtr != null && fastPtr.next != null){
            if(fastPtr == slowPtr) return true;
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Linked_List_Cycle cycle = new Linked_List_Cycle();
        cycle.insert(3);
        cycle.insert(2);
        cycle.insert(0);
        cycle.insert(4);
        cycle.display();
        ListNode isItCycleNode = cycle.head;
        System.out.println(cycle.hasCycle(isItCycleNode));

    }
}
