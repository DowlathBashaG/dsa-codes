package io.dowlath.thread;

public class MyThreadSynchronizedBlock extends Thread{
	DisplaySynchrnoziedBlock d;
	String name;
	MyThreadSynchronizedBlock(DisplaySynchrnoziedBlock d,String name){
		this.d = d;
		this.name = name;
	}
	public void run(){
		d.wish(name);
	}

}
