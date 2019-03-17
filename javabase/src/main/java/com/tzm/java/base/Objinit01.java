package com.tzm.java.base;

public class Objinit01 {

    static int a = 5;

    int b = 10;


    {
        System.out.printf("init block: b = %d\n", b);
    }

    static {
        System.out.printf("static init block: a = %d\n", a);
    }


    int c = 10;

    public Objinit01() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        new Objinit01();
    }

}
