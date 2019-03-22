package com.tzm.java.concurrence;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(2);
        for (int i = 0; i < 2; i++) {
            new Thread(()->{

                try {
                    System.out.println("子线程 " + Thread.currentThread().getName() + "正在执行");
                    Thread.sleep(3000);
                    System.out.println("子线程 " + Thread.currentThread().getName() + "执行完毕");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                latch.countDown();
            }).start();
        }

        try {
            System.out.println("等待子线程执行");
            latch.await();
            System.out.println("子线程执行完毕");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
