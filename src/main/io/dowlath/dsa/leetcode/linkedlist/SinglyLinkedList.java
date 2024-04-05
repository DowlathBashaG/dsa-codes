package io.dowlath.dsa.leetcode.linkedlist;


import java.util.List;

public class SinglyLinkedList {
       private ListNode head;
       static class ListNode {
           public int data;
           public ListNode next;
           ListNode(int data){
               this.data = data;
               this.next = null;
           }
       }

       public void insertFirst(int value){
           ListNode newNode = new ListNode(value);
           newNode.next = head;
           head = newNode;
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

       public ListNode deleteFirstNode(){
           if(head == null){
               return null;
           }
           ListNode temp = head;
           head = head.next;
           temp.next = null;
           return temp;
       }

       public ListNode deleteLastNode(){
           if(head == null || head.next == null){
               return null;
           }
           ListNode current = head;
           ListNode previous = null;
           while(current.next != null){
               previous = current;
               current = current.next;
           }
           previous.next = null;
           return current;
       }
        private void deletePosition(int position) {
           if(position == 0){
               ListNode temp = head;
               head = head.next;
               temp.next = null;
           } else {
               ListNode previous = head;
               int count = 0;
               while(count < position -1){
                   previous = previous.next;
                   count++;
               }
               ListNode current = previous.next;
               previous.next = current.next;
               current.next = null;
           }
         }

         public boolean find(int searchKey) {
           if(head == null){
               return false;
           }
             ListNode current = head;
             while (current != null) {
                 if (current.data == searchKey) {
                     return true;
                 }
                 current = current.next;
             }
             return false;
         }

         public ListNode reverseNode(){
           if(head == null | head.next == null){
               return null;
           }
           ListNode current = head;
           ListNode previous = null;
           ListNode next = null;
           while(current != null){
               next = current.next;
               current.next = previous;
               previous = current;
               current = next;
           }
           return previous;
         }

         public ListNode findMiddleNode(){
           if(head == null || head.next == null){
               return null;
           }
           ListNode slowPtr = head;
           ListNode fastPtr = head ;
           while(fastPtr != null && fastPtr.next != null){
               slowPtr = slowPtr.next;
               fastPtr = fastPtr.next.next;
           }
           return slowPtr;
         }

         public ListNode getNthNodeFromLast(int n){
           if (head == null) {
               return null;
           }
           if( n <= 0 ){
               throw new IllegalArgumentException("Invalid Value" +n);
           }
           ListNode refPtr = head;
           ListNode mainPtr = head;
           int count = 0;

           while(count < n){
               refPtr = refPtr.next;
               count++;
           }

           while(refPtr!= null){
               refPtr = refPtr.next;
               mainPtr = mainPtr.next;
           }
           return mainPtr;
         }

         public void removeDuplicates(){
            ListNode current = head;
            while(current != null && current.next != null){
                if(current.data == current.next.data){
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
         }

         public ListNode insertSortedOrder(int data){
           ListNode newNode = new ListNode(data);
           if(head == null){
               return null;
           }
           ListNode current = head;
           ListNode temp = null;
           while(current != null && current.data < newNode.data){
               temp = current;
               current = current.next;
           }
           newNode.next = current;
           temp.next = newNode;

           return head;
         }

         public void deleteNode(int key) {
             ListNode current = head;
             ListNode temp = null;
             if (current != null && current.data == key){
                     head = current.next;
                     return;
                 }
                 while (current != null && current.data != key) {
                     temp = current;
                     current = current.next;
                 }
                 if (current == null) {
                     return;
                 }
                 temp.next = current.next;
           }

           public boolean detectLoop(){
           ListNode fastPtr = head;
           ListNode slowPtr = head;
           while(fastPtr != null && fastPtr.next != null){
               fastPtr = fastPtr.next.next;
               slowPtr = slowPtr.next;
               if(fastPtr == slowPtr){
                   return true;
               }
           }
           return false;
           }

           public void createdLoopInLinkedList(){
           ListNode first = new ListNode(1);
           ListNode second = new ListNode(2);
           ListNode third = new ListNode(3);
           ListNode fourth = new ListNode(4);
           ListNode fifth = new ListNode(5);
           ListNode sixth = new ListNode(6);
           head = first ;
           first.next = second;
           second.next = third;
           third.next = fourth;
           fourth.next = fifth;
           fifth.next = sixth;
           sixth.next = third;

           }

       public void display(){
           ListNode current = head;
           while(current != null){
               System.out.print(current.data+" -> ");
               current  = current.next;
           }
           System.out.println("null");
       }

       public int length(){
           if (head == null) {
               return 0;
           }
           int count = 0;
           ListNode current = head;
           while(current != null){
               count++;
               current = current.next;
           }
           return count;
       }


       public static void main(String args[]){
           SinglyLinkedList list = new SinglyLinkedList();
           /*
           list.insertFirst(10);
           list.insertFirst(20);
           list.insertFirst(30);
           */
           list.insertLast(10);
          /* list.insertLast(20);*/
           list.insertLast(20);
           list.insertLast(30);
           /*list.insertLast(30);
           list.insertLast(40);*/
           list.insertLast(40);
           list.insertLast(50);
           list.insertLast(60);


          // list.deleteFirstNode();
          // list.deleteLastNode();
          // list.deletePosition(1);

          /* if(list.find(12)){
               System.out.println("Search Key Found ");
           } else {
               System.out.println("Search Key Not Found");
           }*/


          // ListNode newNode = list.reverseNode();
          // list.head = newNode;
           /*
           list.display();
           System.out.println("Length of Node ... : " +list.length());
           ListNode middleNode = list.findMiddleNode();
           System.out.println("Middle Node .... : "+middleNode.data);

           ListNode findNthNode = list.getNthNodeFromLast(1);
           System.out.println("Nth Node from end is ... "+ findNthNode.data);

           list.removeDuplicates();
           list.display();
           */
           //ListNode newNode = list.insertSortedOrder(45);
           list.deleteNode(30);
           list.display();

           list.createdLoopInLinkedList();

           System.out.println(list.detectLoop());
       }


}
