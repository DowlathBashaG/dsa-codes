package io.dowlath.dsa.leetcode.linkedlist;

public class LinkedList_IsPalindrome_Or_Not {
    private ListNode head;
    public static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
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

    public boolean isPalindrome(ListNode head){
        if(head == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode tmp = reverseList(slow);

        while(tmp != null){
            if(tmp.data != head.data){
                return false;
            } else {
                tmp = tmp.next;
                head = head.next;
            }
        }
        return true;
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
        LinkedList_IsPalindrome_Or_Not palindrome = new LinkedList_IsPalindrome_Or_Not();
        palindrome.insertLast(1);
        palindrome.insertLast(2);
        palindrome.insertLast(2);
        palindrome.insertLast(1);
        System.out.println("Given List ....  : ");
        palindrome.display();
        System.out.println("The Given List is it palindrome .... : "+ palindrome.isPalindrome(palindrome.head));

    }
}
