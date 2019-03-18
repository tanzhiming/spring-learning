package com.tzm.java.proxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        Integer a = new Integer(10);
        TraceHandle t = new TraceHandle(a);
        Object obj = Proxy.newProxyInstance(null, new Class[] {Comparable.class}, t);
    }
}
