package io.dowlath.dsa.leetcode.linkedlist;

/*
    O/P :
            Given List .... :
            1 -> 2 -> 3 -> 4 -> 5 -> null
            After removed element from end of list ... 2
            1 -> 2 -> 3 -> 5 -> null
 */
public class Remove_Nth_Node_From_End_Of_List {
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

    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        while(n > 0){
            fast = fast.next;
            n--;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
    public static void main(String[] args) {
        Remove_Nth_Node_From_End_Of_List removeNthNodeFromEndOfList = new Remove_Nth_Node_From_End_Of_List();
        removeNthNodeFromEndOfList.insertLast(1);
        removeNthNodeFromEndOfList.insertLast(2);
        removeNthNodeFromEndOfList.insertLast(3);
        removeNthNodeFromEndOfList.insertLast(4);
        removeNthNodeFromEndOfList.insertLast(5);
        System.out.println("Given List .... :");
        removeNthNodeFromEndOfList.display();
        int removeElement = 2;
        System.out.println("After removed element from end of list ... "+  removeElement);
        ListNode removedList = removeNthNodeFromEndOfList.removeNthFromEnd(removeNthNodeFromEndOfList.head,removeElement);
        removeNthNodeFromEndOfList.head = removedList;
        removeNthNodeFromEndOfList.display();

    }
}
