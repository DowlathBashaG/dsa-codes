package io.dowlath.thread;

public class ProducerConsumerDemo {
	public static void main(String args[]){
		final ProducerConsumer pc = new ProducerConsumer();
		Thread p = new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<10;i++){
					pc.producer();
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		Thread c = new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<10;i++){
					pc.consumer();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		p.start();
		c.start();
		
	}

}
