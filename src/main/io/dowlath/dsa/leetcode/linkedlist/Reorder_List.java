package io.dowlath.dsa.leetcode.linkedlist;

/*
      O/P :
            Give List ... :
            1 -> 2 -> 3 -> 4 -> 5 -> null
            Reorder List ... :
            1 -> 5 -> 2 -> 4 -> 3 -> null
 */
public class Reorder_List {
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
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current  = current.next;
        }
        System.out.println("null");
    }

    public void reorderList(ListNode head){
        if(head == null || head.next == null || head.next.next == null) return;
        ListNode last = head;
        ListNode secLast = head;
        ListNode tmp = head.next;
        while(last.next != null){
            secLast = last;
            last = last.next;
        }
        head.next = last;
        last.next = tmp;
        secLast.next = null;
        reorderList(tmp);
    }
    public static void main(String[] args) {
        Reorder_List reorderList = new Reorder_List();
        reorderList.insertLast(1);
        reorderList.insertLast(2);
        reorderList.insertLast(3);
        reorderList.insertLast(4);
        reorderList.insertLast(5);
        System.out.println("Give List ... :");
        reorderList.display();
        reorderList.reorderList(reorderList.head);
        System.out.println("Reorder List ... :");
        reorderList.display();
    }
}
