package io.dowlath.thread;

public class VolatileDemo {
	private static  int volatileVar = 0;
	  public static void main(String args[]){
		  Thread printVolatile = new Thread(){
			  public void run(){
				  int x = volatileVar;
				  while(true){
					  if(x!=volatileVar){
						  System.out.println("Print Volatile Variable....: "+volatileVar);
					  }
					  x = volatileVar;
				  }
			  }
		  };
		  Thread incrementVolatile = new Thread(){
			  public void run(){
				  int x = volatileVar;
				  while(true){
					  ++volatileVar;
					  System.out.println("Increment Volatile Variable....:"+volatileVar);
					  try{
						  Thread.sleep(800);
					  }
					  catch(InterruptedException e){
						  e.printStackTrace();
					  }
				  }
			  }
		  };
		  incrementVolatile.start();
		  printVolatile.start();
	  }

}
