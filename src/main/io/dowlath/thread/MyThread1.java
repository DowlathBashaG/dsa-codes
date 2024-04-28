package io.dowlath.thread;

public class MyThread1 extends Thread{
	DisplaySynchronized d1;
	
	MyThread1(DisplaySynchronized ds){
		this.d1 = ds;	
	}
	
	public void run(){
		d1.displayN();
	}

}
