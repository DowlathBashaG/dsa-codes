package src.main.io.dowlath.producer_consumer_blockingqueue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_LinkedList_Demo {
    public static void main(String[] args) {
        Queue<Integer> buffer = new LinkedList<>();
        int maxSize = 5;

        Thread producerThread = new Thread(()->{
            for(int i=0; i<10; i++){
                synchronized (buffer){
                    while(buffer.size() == maxSize){
                        try{
                            System.out.println("Buffer is full, so waiting");
                            buffer.wait();
                        }catch(InterruptedException e){
                            throw new RuntimeException(e);
                        }
                    }
                    buffer.add(i);
                    System.out.println("Produced ... : "+ i);
                    try{
                        Thread.sleep(3000);
                    }catch(InterruptedException e){
                        throw new RuntimeException(e);
                    }
                    buffer.notifyAll();
                }
            }

        },"Producer");

        Thread consumerThread = new Thread(() ->{
            for(int i=0; i<10; i++){
                synchronized (buffer){
                    while(buffer.isEmpty()){
                        try{
                            System.out.println("Buffer is empty, so waiting");
                            buffer.wait();
                        }catch(InterruptedException e){
                            throw new RuntimeException(e);
                        }
                    }
                    int val = buffer.remove();
                    System.out.println("Consumer ... : "+val);
                    try{
                        Thread.sleep(5000);
                    }catch(InterruptedException e){
                        throw new RuntimeException(e);
                    }
                    buffer.notifyAll();
                }
            }
        },"Consumer");

        producerThread.start();;
        consumerThread.start();
    }

}
