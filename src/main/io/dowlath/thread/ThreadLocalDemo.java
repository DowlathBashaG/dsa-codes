package io.dowlath.thread;

public class ThreadLocalDemo extends Thread {
	//static ThreadLocal tl = new ThreadLocal();
	static ThreadLocal tl =new ThreadLocal(){
		public Object initialValue(){
			return "I am Parent";
		}
	};
	public static void main(String args[]){
		System.out.println(tl.get());
		tl.set("Dowlath");
		System.out.println(tl.get());
		new ThreadLocalDemo().start();
	}
	public void run(){
		System.out.println(tl.get());
	}
    
}
