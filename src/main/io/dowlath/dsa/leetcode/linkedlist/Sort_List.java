package io.dowlath.dsa.leetcode.linkedlist;

import java.util.PriorityQueue;

/*   O/P :
            Before sort List ....  :
            4 -> 2 -> 1 -> 3 -> null
            After sort List ....  :
            1 -> 2 -> 3 -> 4 -> null
 */
public class Sort_List {
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
    public ListNode sortList(ListNode head){
        if(head == null) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
          (a,b) -> a.data - b.data
        );
        while(head != null){
            ListNode next = head.next;
            head.next = null;
            pq.add(head);
            head = next;
        }
        ListNode dummy = new ListNode(0);
        ListNode output = dummy;

        while(!pq.isEmpty()){
            dummy.next = pq.poll();
            dummy = dummy.next;
        }
        return output.next;
    }

    public static void main(String[] args) {
        Sort_List sortList = new Sort_List();
        sortList.insertLast(4);
        sortList.insertLast(2);
        sortList.insertLast(1);
        sortList.insertLast(3);
        System.out.println("Before sort List ....  : ");
        sortList.display();
        System.out.println("After sort List ....  : ");
        ListNode sortListNode = sortList.sortList(sortList.head);
        sortList.head = sortListNode;
        sortList.display();

    }
}
