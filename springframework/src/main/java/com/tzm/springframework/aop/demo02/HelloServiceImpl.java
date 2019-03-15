package com.tzm.springframework.aop.demo02;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello, " + name;
    }
}
