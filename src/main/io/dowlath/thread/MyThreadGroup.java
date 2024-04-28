package io.dowlath.thread;

public class MyThreadGroup extends Thread{
	
	MyThreadGroup(ThreadGroup tg,String name){
		super(tg,name);
	}
	
	
	
	public static void main(String args[]) throws InterruptedException {
		ThreadGroup tg = new ThreadGroup("TamilNadu");
		MyThreadGroup mtg1 = new MyThreadGroup(tg,"Chennai");
		MyThreadGroup mtg2 = new MyThreadGroup(tg,"Salem");
		MyThreadGroup mtg3 = new MyThreadGroup(tg,"Erode");
		
		mtg1.start();
		mtg2.start();
		mtg3.start();
		ThreadGroup group = currentThread().getThreadGroup();
		tg.interrupt();		
	}
	
	public void run(){
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println("catch block reached -->"+currentThread());
		}
	}

}
