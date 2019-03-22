package com.tzm.java.concurrence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test11 {


    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<String> list = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Integer> taskList = Arrays.asList(2, 1, 3, 4, 5, 6, 7, 8, 9, 10);

        CompletableFuture[] cfs = taskList.stream()
                .map(integer -> CompletableFuture.supplyAsync(()->calc(integer), executorService)
                .thenApply(h->Integer.toString(h))
                .whenComplete((s, e)-> {
                    System.out.println("任务"+s+"完成!result="+s+"，异常 e="+e+","+new Date());
                    list.add(s);
                })).toArray(CompletableFuture[]::new);

        CompletableFuture.allOf(cfs).join();
        System.out.println("list="+list+",耗时="+(System.currentTimeMillis()-start));
    }


    public static Integer calc(Integer i) {
        try {

            if (i == 1) {
                Thread.sleep(3000);
            } else if (i == 5) {
                Thread.sleep(5000);
            } else {
                Thread.sleep(1000);
            }

            System.out.println("task线程：" + Thread.currentThread().getName()
                    + "任务i=" + i + ",完成！+" + new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i;
    }
}
