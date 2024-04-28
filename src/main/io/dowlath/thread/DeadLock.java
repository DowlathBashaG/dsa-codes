package io.dowlath.thread;

public class DeadLock {
	
	String st1= "Dowlath";
	String st2= "Basha";
	
	Thread t1 = new Thread(){
		public void run(){
			while(true){
				synchronized(st1){
					synchronized(st2){
						System.out.println(st1+st2);
					}
				}
			}
		}
	};
	
	Thread t2 = new Thread();
	public void run(){
		while(true){
			synchronized(st2){
				synchronized(st1){
					System.out.println(st2+st1);
				}
			}
		}
	};
	
	public static void main(String args[]){
		DeadLock dl = new DeadLock();
		dl.t1.start();
		dl.t2.start();
	}

}
