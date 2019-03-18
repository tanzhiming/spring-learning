package com.tzm.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TraceHandle implements InvocationHandler {

    private Object target;


    public TraceHandle(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("trace --------------");
        return method.invoke(target, args);
    }
}
