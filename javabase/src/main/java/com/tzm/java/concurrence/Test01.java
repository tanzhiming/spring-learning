package com.tzm.java.concurrence;

public class Test01 {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(()->{
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("interrupted state: " + Thread.currentThread().isInterrupted());
                Thread.currentThread().interrupt();
            }
        });
        t.start();
        Thread.sleep(1000);
        t.interrupt();
        Thread.sleep(1000);
        System.out.println("t interrupted state: " + t.isAlive());
    }
}
