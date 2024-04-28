package io.dowlath.thread;

import java.util.Random;

public class ProducerConsumer {
	Random r = new Random();
	boolean isProduced = false;
	int intValue = 0;
	
	public synchronized void producer(){
		if(isProduced){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			}
		intValue = r.nextInt(10);
		System.out.println("Produce ... : "+intValue);
		isProduced = true;
		this.notify();	
		
	}
	
	public synchronized void consumer(){
		if(!isProduced){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Consume ... :"+intValue);
			isProduced = false;
			this.notify();
		}
	}

}
