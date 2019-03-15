package com.tzm.springframework.aop.demo01;

public class SimplePojo implements Pojo {
    @Override
    public void print() {
        System.out.println("SimplePojo print");
    }
}
