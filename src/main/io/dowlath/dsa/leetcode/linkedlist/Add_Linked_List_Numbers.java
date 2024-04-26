package io.dowlath.dsa.leetcode.linkedlist;

/*
       Explanation :

       I/P :
              l1 = [ 2,4,3 ]
              l2 = [ 5,6,4 ]

       O/P :
              342 + 465 => 807

       ======================================

        Given List 1 .... :
        2 -> 4 -> 3 -> null
        Given List 2 .... :
        5 -> 6 -> 4 -> null
        Result added two list .... :
        7 -> 0 -> 8 -> null


 */
public class Add_Linked_List_Numbers {
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

    private ListNode addTwoList(ListNode l1, ListNode l2) {
        ListNode output = new ListNode(0);
        ListNode dummy = output;
        int carry = 0;
        while(l1 != null || l2 != null || carry !=0 ){
            if(l1 != null){
                carry+=l1.data;
                l1 = l1.next;
            }
            if(l2 != null){
                carry+=l2.data;
                l2 = l2.next;
            }
            dummy.next = new ListNode(carry % 10); // if carry 8 % 10 => 8 , if carry 10 , 10 % 10 => 0
            carry = carry / 10;
            dummy = dummy.next;
        }
        return output.next;
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
        Add_Linked_List_Numbers addLinkedListNumbers_1= new Add_Linked_List_Numbers();
        addLinkedListNumbers_1.insertLast(2);
        addLinkedListNumbers_1.insertLast(4);
        addLinkedListNumbers_1.insertLast(3);
        Add_Linked_List_Numbers addLinkedListNumbers_2= new Add_Linked_List_Numbers();
        addLinkedListNumbers_2.insertLast(5);
        addLinkedListNumbers_2.insertLast(6);
        addLinkedListNumbers_2.insertLast(4);
        System.out.println("Given List 1 .... :");
        addLinkedListNumbers_1.display();
        System.out.println("Given List 2 .... :");
        addLinkedListNumbers_2.display();
        System.out.println("Result added two list .... :");
        ListNode tmp = addLinkedListNumbers_1.addTwoList(addLinkedListNumbers_1.head,addLinkedListNumbers_2.head);
        addLinkedListNumbers_1.head = tmp;
        addLinkedListNumbers_1.display();
    }


}
