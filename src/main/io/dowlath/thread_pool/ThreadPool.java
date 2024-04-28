package io.dowlath.thread_pool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;



public class ThreadPool {
    private BlockingQueue<Runnable> taskQueue;
    private boolean poolShutDownInitiated = false;
    public ThreadPool(int nThreads){
    	taskQueue = new LinkedBlockingQueue<Runnable>(nThreads);
    	for(int i=1;i<=nThreads;i++){
    		ThreadPoolsThreadImplementation tpt = new ThreadPoolsThreadImplementation(taskQueue,this);
    		tpt.setName("Thread-"+i);
    		System.out.println("Thread"+i+"created in thread pool");
    		tpt.start();
    	}
    }
    public synchronized void execute(Runnable task)throws Exception{
    	if(this.poolShutDownInitiated){
    		throw new Exception("No further task added");
    	}
    	this.taskQueue.put(task);
    	System.out.println("Task added");
    }
    public boolean isPoolShutDownInitiated(){
    	return poolShutDownInitiated;
    }
    public synchronized void shutDown(){
    	this.poolShutDownInitiated = true; 
    }
}
