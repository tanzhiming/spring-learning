package com.tzm.java.concurrence;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test09 {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            System.out.println("hello world");
        });
    }
}
