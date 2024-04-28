package io.dowlath.thread;

public class SynchronizedDemo {
	public static void main(String args[]){
		Display d = new Display();
		MyThread t1 = new MyThread(d,"Dhoni");
		MyThread t2 = new MyThread(d,"Raina");
		t1.start();
		t2.start();
	}

}
