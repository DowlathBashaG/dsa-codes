package io.dowlath.thread;

public class DisplaySynchrnoziedBlock {
	public void wish(String name){
		;;;;;;;;;;;;;;;;;;;;;;;; // 1 lakh lines of code here
		//synchronized(this){
		synchronized(DisplaySynchrnoziedBlock.class){
		for(int i=0;i<10;i++){
			System.out.print("Good Monring : ");
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(name);
		}
		}
		;;;;;;;;;; // 1 lakh lines of code here
	}

}
