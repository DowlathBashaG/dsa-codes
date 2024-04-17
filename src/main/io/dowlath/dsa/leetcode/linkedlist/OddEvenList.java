package io.dowlath.dsa.leetcode.linkedlist;

/*
         I/P :     1-> 2 -> 3 -> 4 -> 5 -> null
         O/P :     1-> 3-> 5-> 2->4-> null

         The Given Linked List ... :
         1 -> 2 -> 3 -> 4 -> 5 -> null
         The Odd Even Linked List ... :
         1 -> 3 -> 5 -> 2 -> 4 -> null
 */

public class OddEvenList {
    private ListNode head;
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = next;
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

    public ListNode oddEvenList(ListNode head){
        if(head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode temp = even;
        while(even != null && even.next !=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = temp;
        return head;
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
        OddEvenList oddEvenList = new OddEvenList();
        oddEvenList.insertLast(1);
        oddEvenList.insertLast(2);
        oddEvenList.insertLast(3);
        oddEvenList.insertLast(4);
        oddEvenList.insertLast(5);
        System.out.println("The Given Linked List ... : ");
        oddEvenList.display();
        System.out.println("The Odd Even Linked List ... : ");
        ListNode temp = oddEvenList.oddEvenList(oddEvenList.head);
        oddEvenList.head = temp;
        oddEvenList.display();

    }
}
