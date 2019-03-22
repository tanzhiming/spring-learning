package com.tzm.java.concurrence;

public class Test05 {

    public static void main(String[] args) {
        Thread t = new Thread(()->{
            int i = 5/0;
            System.out.println(i);
        });
        System.out.println(t.getUncaughtExceptionHandler());
        t.setUncaughtExceptionHandler((t1, e)->{
            System.out.println("thread: " + t1.getName());
            System.out.println(e.toString());
        });
        t.start();
        System.out.println(t.getThreadGroup());
    }
}

