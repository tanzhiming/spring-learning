package com.tzm.java.exception;

import java.io.IOException;
import java.util.Arrays;

public class Test01 {

    public static void main(String[] args) throws Exception {

        try {
            Test01 test01 = new Test01();
            test01.test();

        } catch (Exception e) {
//            Throwable[] list = e.getSuppressed();
////            Arrays.stream(list).forEach(System.out::println);

//            StackTraceElement[] frames = e.getStackTrace();
//            for (StackTraceElement frame: frames) {
//                System.out.println(frame.toString());
//            }

        }


    }


    public void test() throws Exception {
        try (MyResource r = new MyResource()) {
            r.test();
        }
    }


}


class MyResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        throw new IOException("close exception");
    }

    public void test() {
        throw new RuntimeException("test exception");
    }

}
