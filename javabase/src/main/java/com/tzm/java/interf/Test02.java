package com.tzm.java.interf;

public class Test02 {

    public static void main(String[] args) {
        A a = new B();
        a.print();
    }

    public interface A {
        default void print() {
            System.out.println("print A");
        }
    }

    public static class B implements  A {

        @Override
        public void print() {
            A.super.print();
            System.out.println("print B");
        }
    }
}
