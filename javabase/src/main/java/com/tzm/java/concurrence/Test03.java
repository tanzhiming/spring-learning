package com.tzm.java.concurrence;

public class Test03 {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(()->{
                while (true) {
                    System.out.printf("max priority [%s] --------------\n", Thread.currentThread().getName());
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                }
            });
            t.setPriority(Thread.MAX_PRIORITY);
            t.start();
        }

        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(()->{
                while (true) {
                    System.out.printf("min priority [%s] --------------\n", Thread.currentThread().getName());
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                }
            });
            t.setPriority(Thread.MIN_PRIORITY);
            t.start();
        }
    }
}
