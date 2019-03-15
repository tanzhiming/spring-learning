package com.tzm.springframework.aop.demo01;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("hello world");
    }
}
