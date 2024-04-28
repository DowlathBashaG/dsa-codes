package io.dowlath.thread;

public class SynchronizedBlockDemo {
	public static void main(String args[]){
	DisplaySynchrnoziedBlock db1 = new DisplaySynchrnoziedBlock();
	DisplaySynchrnoziedBlock db2= new DisplaySynchrnoziedBlock();
	MyThreadSynchronizedBlock t1 = new MyThreadSynchronizedBlock(db1,"Dowlath");
	MyThreadSynchronizedBlock t2 = new MyThreadSynchronizedBlock(db2,"Basha");
	t1.start();
	t2.start();
	
	}
	
}
