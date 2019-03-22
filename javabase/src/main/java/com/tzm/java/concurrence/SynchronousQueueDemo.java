package com.tzm.java.concurrence;

import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueDemo {

    public static void main(String[] args) {
        SynchronousQueue<String> queue = new SynchronousQueue<>();
        new Thread(() -> {
            try {
                System.out.println("线程" + Thread.currentThread().getName());
                Thread.sleep(5000);
                queue.put("hello world");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                String message = queue.take();
                System.out.println("线程" + Thread.currentThread().getName() + ", message: " + message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
