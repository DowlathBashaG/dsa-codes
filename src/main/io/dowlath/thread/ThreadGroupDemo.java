package io.dowlath.thread;

public class ThreadGroupDemo {
	public static void main(String args[]){
		Thread t1 = Thread.currentThread();
		ThreadGroup tg1 = t1.getThreadGroup();
		System.out.println("Main under the following TG...:"+tg1.getParent());
		ThreadGroup tg2 = tg1.getParent();
		//tg2.list();
	}

}
