package io.dowlath.dsa.leetcode.linkedlist;

/*

        I/P :
               List 1 :  1 -> 2 -> 4
               List 2 :  1 -> 3 -> 4

        O/P :
               1 -> 1 -> 2 -> 3 -> 4 -> 4 -> null
 */
public class Merge_Two_Sorted_Linked_List {
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
        while(current.next !=null){
            current = current.next;
        }
        current.next = newNode;
    }
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode tmp = new ListNode(0);
        ListNode output = tmp;
        while(l1 != null && l2 != null){
            if(l1.data > l2.data){
                tmp.next = l2;
                l2 = l2.next;
            } else {
                tmp.next = l1;
                l1 = l1.next;
            }
            tmp = tmp.next;
        }
        if(l1 != null){
            tmp.next = l1;
        }
        if(l2 != null){
            tmp.next = l2;
        }
        return output.next;
    }
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {

        Merge_Two_Sorted_Linked_List list1 = new Merge_Two_Sorted_Linked_List();
        Merge_Two_Sorted_Linked_List list2 = new Merge_Two_Sorted_Linked_List();
        list1.insert(1);
        list1.insert(2);
        list1.insert(4);

        list2.insert(1);
        list2.insert(3);
        list2.insert(4);

        ListNode mergedList = list1.mergeTwoLists(list1.head,list2.head);
        list1.head = mergedList;
        list1.display();

    }

}
