package io.dowlath.producer_consumer;

import java.util.Random;

public class ProducerConsumer {
	Random r = new Random();
	boolean isProduced = false;
	int theValue = 0;
	
	public synchronized void produce(){
		if(isProduced){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		theValue = r.nextInt(10);
		System.out.println("Produced   :   "+ theValue);
		isProduced = true;
		this.notify();
	}
	
	public synchronized void consume(){
		if(!isProduced){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Consumed   :   "+ theValue);
		isProduced = false;
		this.notify();
	}

}
