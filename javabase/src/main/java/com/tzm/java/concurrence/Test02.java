package com.tzm.java.concurrence;

public class Test02 {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            int i = 0;
            while (i < 5) {
                System.out.format("[t1] i = %d\n", i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
            }
        });
        System.out.println(t1.getState());
        t1.start();
        t1.join(1000);
        t1.suspend();
        System.out.println(t1.getState());
        Thread.sleep(2000);
        t1.resume();
        System.out.println(t1.getState());
        System.out.println("[main] finished");

    }
}
