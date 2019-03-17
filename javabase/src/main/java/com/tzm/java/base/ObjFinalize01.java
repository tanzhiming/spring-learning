package com.tzm.java.base;

public class ObjFinalize01 {

    public static void main(String[] args) throws InterruptedException {
        Obj obj = new Obj();
        obj = null;

        // 过时
        System.runFinalizersOnExit(true);
//        Runtime.getRuntime().addShutdownHook(new Thread() {
//            @Override
//            public void run() {
//                System.out.println("close");
//            }
//        });

        Thread.sleep(10 * 1000);

        System.out.println("main finished");
    }
}


class Obj {
    public Obj() {
        System.out.println("obj init");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("obj finalize");
    }
}
