package com.tzm.java.concurrence;

public class Test04 {

    public static void main(String[] args) {
        Thread daemon = new Thread(()-> {
            int i = 0;
            while (true) {
                System.out.printf("[%s] deamo run times %d\n", Thread.currentThread().getName(), i++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        daemon.setDaemon(true);
        daemon.start();
        Thread t = new Thread(()->{
            for(int i = 0; i < 10; i++) {
                System.out.printf("[%s] thread run times %d\n", Thread.currentThread().getName(), i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }
}
