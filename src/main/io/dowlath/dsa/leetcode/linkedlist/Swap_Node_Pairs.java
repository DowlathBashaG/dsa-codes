package io.dowlath.dsa.leetcode.linkedlist;

/*
   O/P :

        Given List ....  :
        1 -> 2 -> 3 -> 4 -> null
        After Swap List of Nodes....  :
        2 -> 1 -> 4 -> 3 -> null
 */
public class Swap_Node_Pairs {
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

    public ListNode swapPairs(ListNode head){
        if(head == null) return null;
        ListNode current = head;
        while(current != null && current.next != null){
            int tmp = current.data;
            current.data = current.next.data;
            current.next.data = tmp;
            current = current.next.next;
        }
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
        Swap_Node_Pairs swapNodePairs = new Swap_Node_Pairs();
        swapNodePairs.insertLast(1);
        swapNodePairs.insertLast(2);
        swapNodePairs.insertLast(3);
        swapNodePairs.insertLast(4);
        System.out.println("Given List ....  : ");
        swapNodePairs.display();
        System.out.println("After Swap List of Nodes....  : ");
        ListNode swapPairs = swapNodePairs.swapPairs(swapNodePairs.head);
        ListNode head = swapPairs;
        swapNodePairs.display();

    }
}
