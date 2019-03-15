package com.tzm.springframework.aop.demo01;

import org.springframework.aop.framework.ProxyFactory;

public class Main {

    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory(new SimplePojo());
        factory.addInterface(Pojo.class);
        factory.addAdvice(new MyAdvice());
        factory.setExposeProxy(true);
        Pojo pojo = (Pojo) factory.getProxy();
        pojo.print();
    }
}
