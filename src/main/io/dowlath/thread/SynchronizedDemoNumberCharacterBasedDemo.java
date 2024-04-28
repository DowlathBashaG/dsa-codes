package io.dowlath.thread;

public class SynchronizedDemoNumberCharacterBasedDemo {
	public static void main(String args[]){
		DisplaySynchronized d = new DisplaySynchronized();
		MyThread1 t1 = new MyThread1(d);
		MyThread2 t2 = new MyThread2(d);
		t1.start();
		t2.start();	
	}

}
