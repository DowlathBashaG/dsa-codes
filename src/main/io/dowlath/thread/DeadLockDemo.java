package io.dowlath.thread;

public class DeadLockDemo {
	public static void main(String args[]){
	
	final String R1 = "Resource R1";
	final String R2 = "Resource R2";

	
	Thread t1 = new Thread(){
	   public void run(){
			//System.out.println("Thread 1 : Trying to get Acquired lock for Resource R1");
			synchronized(R1){
				System.out.println("Thread 1 :  Acquired lock for Resource R1");
			}
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}		
			System.out.println("Thread 1 : Trying to get Acquired lock for Resource R2");
			synchronized(R2){
				System.out.println("Thread 1 : Acquired lock for Resource R2");
			}
			}
		};
	
	Thread t2 = new Thread(){
	   public void run(){
		  // System.out.println("Thread 2 : Trying to get Acquired lock for Resource R2");
		   synchronized(R2){
			   System.out.println("Thread 2 : Acquired lock for Resource R2");
		   }
		   try{
			   Thread.sleep(100);
		   }
		   catch(InterruptedException e){
			   e.printStackTrace();
		   }
		   System.out.println("Thread 2 : Trying to get Acquired lock for Resource R1");
		   synchronized(R1){
			    System.out.println("Thread 2 : Acquired lock for Resource R1");
		   }
	   }
	 	
	};
	
	   t1.start();
	   t2.start();
		
	}
	
}
