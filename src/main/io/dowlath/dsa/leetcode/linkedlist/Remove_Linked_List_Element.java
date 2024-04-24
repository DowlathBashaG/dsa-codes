package io.dowlath.dsa.leetcode.linkedlist;

/*
   O/P:
            Given List ....  :
            1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
            After deleting element.... :
            1 -> 2 -> 3 -> 4 -> 5 -> null
 */

public class Remove_Linked_List_Element {
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
    public ListNode removeElements(ListNode head,int val){
        ListNode dummy = new ListNode(0);
        ListNode output = dummy;
        dummy.next = head;
        while(head !=null){
            if(head.data == val){
                head = head.next;
                dummy.next = head;
            } else {
                head = head.next;
                dummy = dummy.next;
            }
        }
        return output.next;
    }


    public static void main(String[] args) {
        Remove_Linked_List_Element removeList = new Remove_Linked_List_Element();
        removeList.insertLast(1);
        removeList.insertLast(2);
        removeList.insertLast(3);
        removeList.insertLast(4);
        removeList.insertLast(5);
        removeList.insertLast(6);
        System.out.println("Given List ....  : ");
        removeList.display();
        System.out.println("After deleting element.... :");
        int removeElement = 3;
        ListNode temp = removeList.removeElements(removeList.head,removeElement);
        removeList.head = temp;
        removeList.display();
    }
}
