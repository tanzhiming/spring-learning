package com.tzm.springframework.aop.demo02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class, App2Config.class);
        HelloService helloService = ctx.getBean(HelloService.class);
        System.out.println(helloService.sayHello("tanzhiming"));
    }
}
