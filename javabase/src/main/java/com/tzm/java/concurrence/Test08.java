package com.tzm.java.concurrence;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class Test08 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> computeTask = new FutureTask<>(()->{
            int a = 10 + 15;
            TimeUnit.SECONDS.sleep(5);
            return a;
        });
        Thread t = new Thread(computeTask);
        t.start();
        int ret = computeTask.get();
        System.out.println("ret: " + ret);
        System.out.println("finished");
    }
}
