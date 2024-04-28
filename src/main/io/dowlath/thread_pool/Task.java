package io.dowlath.thread_pool;

public class Task implements Runnable{
    public void run(){
    	 try{
    		 Thread.sleep(1000);
    		 System.out.println("Task added ");
    	 }
    	 catch(Exception e){
    		 e.printStackTrace();
    	 }
    }
}
