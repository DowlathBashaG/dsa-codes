package io.dowlath.lrucache;

import java.util.HashMap;
/*
      I/P :

           LRUCache cache = new LRUCache(3);
            cache.put(1,3);
            cache.put(4,2);

            System.out.println(cache.get(1));   // returns 3

            cache.put(5,6);
            System.out.println(cache.get(7));   // returns -1 (not found)
            System.out.println(cache.get(5));   // returns 6

            cache.put(7,4);                     // evicts key 4

            System.out.println(cache.get(4));   // returns -1 (not found)

            System.out.println(cache.get(1));   // returns 3
            System.out.println(cache.get(5));   // returns 6

      O/P :

                 3
                -1
                6
                -1
                3
                6
 */
class Node{
    int key;
    int value;
    Node next;
    Node prev;
    public Node(int key,int value){
        this.key = key;
        this.value = value;
    }
}

public class LRUCache {
    Node head;
    Node tail;
    HashMap<Integer,Node> map = null;
    int cap = 0;

    public LRUCache(int capacity){
        this.cap = capacity;
        map=new HashMap<>();
    }

    public int get(int key){
        if(map.containsKey(key)){
            Node node = map.get(key);
            removeNde(node);
            putOnTop(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key,int value){
        // if key is present update it value then move that node at the head
        if(map.containsKey(key)){
            Node t = map.get(key);
            t.value = value;
            removeNde(t);
            putOnTop(t);
        } else {
            // if max cap reached then remove least accessed record
            if(map.size() >= cap){
                map.remove(tail.key);
                removeNde(tail);
            }
            Node node = new Node(key, value);
            map.put(key,node);
            putOnTop(node);
        }
    }
    private void removeNde(Node node){
        Node prevNode = node.prev;
        Node nextNode = node.next;
        if(prevNode != null){
            prevNode.next = node.next;
        }else{
            head = nextNode;
        }
        if(nextNode != null){
            nextNode.prev = prevNode;
        }else{
            tail = prevNode;
        }
    }

    private void putOnTop(Node node){
        node.next = head;
        node.prev = null;
        if(head != null)
            head.prev = node;
        head = node;
        if(tail == null){
            tail = node;
        }
    }
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);
        cache.put(1,3);
        cache.put(4,2);

        System.out.println(cache.get(1));   // returns 3

        cache.put(5,6);
        System.out.println(cache.get(7));   // returns -1 (not found)
        System.out.println(cache.get(5));   // returns 6

        cache.put(7,4);                     // evicts key 4

        System.out.println(cache.get(4));   // returns -1 (not found)

        System.out.println(cache.get(1));   // returns 3
        System.out.println(cache.get(5));   // returns 6
    }
}
