package io.dowlath.dsa.leetcode.linkedlist;

public class Reverse_Linked_List {
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

    /*
            Input  :  10 -> 20 -> 30 -> 40 -> 50 -> null
            Output :  50 -> 40 -> 30 -> 20 -> 10 -> null

            NULL :
                     20 -> 30 -> 40 -> 50 -> null
                     10-> null

                     10 -> NULL
                     30 -> 40 -> 50 -> null
                     20 -> 10 -> null

     */




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
    public static void main(String[] args) {
        Reverse_Linked_List rll = new Reverse_Linked_List();
        rll.insertLast(10);
        rll.insertLast(20);
        rll.insertLast(30);
        rll.insertLast(40);
        rll.insertLast(50);
        System.out.println("Given List ....  : ");
        rll.display();
        ListNode newNode = rll.reverseList(rll.head);
        System.out.println("Reverse List .... : ");
        rll.head = newNode;
        rll.display();
    }
}
