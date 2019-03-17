package com.tzm.java.interf;

public class Test03 {

    public static void main(String[] args) {
        C c = new C();
        c.print();
    }

    public interface  A {
        default void print() {
            System.out.println("print A");
        }
    }

    public interface B {
        default void print() {
            System.out.println("print B");
        }
    }

    public static class C implements A, B {

        @Override
        public void print() {
            B.super.print();
        }
    }
}
