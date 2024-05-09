package src.main.io.dowlath.producer_consumer_blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(5);

        Thread producerThread = new Thread(()->
        {
            for(int i=0; i<10; i++){
                try{
                    buffer.put(i);
                    System.out.println("Produced  "+ i);
                    Thread.sleep((long) (Math.random() * 5000));
                }catch(InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        },"Producer");

        Thread consumerThread = new Thread(()->
        {
            for(int i=0; i<10; i++){
                try{
                    int value = buffer.take();
                    System.out.println("Consumed  "+ value);
                    Thread.sleep(3000);
                }catch(InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        },"Consumer");

producerThread.start();
consumerThread.start();
    }
}
