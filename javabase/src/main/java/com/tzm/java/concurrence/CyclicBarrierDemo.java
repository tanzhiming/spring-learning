package com.tzm.java.concurrence;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

    public static void main(String[] args) {
        int n = 4;
        CyclicBarrier barrier = new CyclicBarrier(n, ()->{
            System.out.println("当前线程" + Thread.currentThread().getName());
        });
        for (int i = 0; i < n; i++)
            new Thread(()->{
                System.out.println("线程"+Thread.currentThread().getName()+"正在写入数据...");
                try {
                    Thread.sleep(3000);
                    System.out.println("线程"+Thread.currentThread().getName()+"写入数据完毕，等待其他线程写入完毕");
                    barrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }catch(BrokenBarrierException e){
                    e.printStackTrace();
                }
                System.out.println("所有线程写入完毕，继续处理其他任务...");
            }).start();
    }
}
