package io.dowlath.thread_pool;

import java.util.concurrent.BlockingQueue;

public class ThreadPoolsThreadImplementation extends Thread{
	private BlockingQueue<Runnable> taskQueue;
	private ThreadPool threadPool;
	public ThreadPoolsThreadImplementation(BlockingQueue<Runnable> taskQueue,ThreadPool threadPool){
		this.taskQueue = taskQueue;
		this.threadPool = threadPool;		
	}
	public void run(){
		try{
			while(true){
				System.out.println("Task Executed....");
				Runnable runnable = this.taskQueue.take();
				System.out.println("Task taken");
				runnable.run();
				System.out.println("Task executed");
				if(threadPool.isPoolShutDownInitiated() && this.taskQueue.size() ==0){
					this.interrupt();
					Thread.sleep(1);
				}
			}
		}
		catch(InterruptedException e){
			System.out.println("shutDown initiated");
		}
	}
	
}