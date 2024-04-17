package io.dowlath.dsa.leetcode.linkedlist;

public class Middle_Of_The_Linked_List {
    private ListNode head;
    static class ListNode{
        private int data;
        private ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int value){
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
    public ListNode middleNode(ListNode head){
        if(head == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null  & fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Middle_Of_The_Linked_List middle = new Middle_Of_The_Linked_List();
        middle.insert(1);
        middle.insert(2);
        middle.insert(3);
        middle.insert(4);
        middle.insert(5);
        ListNode temp = middle.middleNode(middle.head);
        System.out.println("This is middle node : "+ temp.data);
    }
}
