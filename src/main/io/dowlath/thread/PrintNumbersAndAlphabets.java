package src.main.io.dowlath.thread;

/*
OUTPUT :

A 1 B 2 C 3 D 4 E 5 F 6 G 7 H 8 I 9 J 10 K 11 L 12 M 13
N 14 O 15 P 16 Q 17 R 18 S 19 T 20 U 21 V 22 W 23 X 24 Y 25 Z 26
 */
public class PrintNumbersAndAlphabets {
    private static boolean printLetter = true;

    private static final Object lock = new Object();

    public static void main(String args[]){


        Runnable letterTask = new Runnable() {
            @Override
            public void run() {
                for(char ch = 'A'; ch<='Z';ch++){
                    synchronized (lock){
                        if(!printLetter){
                            try{
                                lock.wait();
                            }catch(InterruptedException e){
                                throw new RuntimeException(e);
                            }
                        }
                        System.out.print(" "+ ch);
                        printLetter = false;
                        lock.notify();
                    }
                }
            }
        };


        Runnable numberTask = new Runnable() {
            @Override
            public void run() {
                for(int num=1; num<=26; num++){
                    synchronized (lock){
                        if(printLetter){
                            try{
                                lock.wait();
                            }catch(InterruptedException e){
                                throw new RuntimeException(e);
                            }
                        }
                        System.out.print(" "+ num);
                        printLetter = true;
                        lock.notify();
                    }
                }
            }
        };


        Thread letterThread = new Thread(letterTask);
        Thread numberThread = new Thread(numberTask);

        letterThread.start();
        numberThread.start();

        try{
            letterThread.join();
            numberThread.join();
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
