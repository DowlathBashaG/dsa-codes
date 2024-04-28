package io.dowlath.thread;

public class MyThread2 extends Thread {
	DisplaySynchronized d2;
	MyThread2(DisplaySynchronized d){
		this.d2 = d;
	}
	public void run(){
		d2.displayC();
	}
}
