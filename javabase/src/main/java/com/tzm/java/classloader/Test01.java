package com.tzm.java.classloader;

import java.time.Instant;

public class Test01 {

    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        System.out.println(Instant.class.getClassLoader());
        System.out.println(Test01.class.getClassLoader());

    }
}
