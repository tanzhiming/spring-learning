package com.tzm.springframework.aop.demo03;

import org.springframework.stereotype.Service;

@Service
public class HelloImpl implements Hello {

    @Override
    public String sayHello(String name) {
        return "hello, " + name;
    }
}
