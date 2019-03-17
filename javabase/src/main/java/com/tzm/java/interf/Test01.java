package com.tzm.java.interf;

public class Test01 {

    public static void main(String[] args) {
        A a = new C();
        B b = new C();
        a.print();
        b.print();
        b.print("tanzhiming");
        A e = new E();
        e.print();


    }


    public static interface A {
        void print();
    }
    public static interface B {
        void print();
        void print(String name);
    }

    public static class C implements A, B {

        @Override
        public void print() {
            System.out.println("hello C");
        }

        @Override
        public void print(String name) {
            System.out.println("hello, " + name);
        }
    }

    public static abstract class D {
        public void print() {
            System.out.println("print D");
        }
    }

    public static class E extends D implements A {

        @Override
        public void print() {
            super.print();
            System.out.println("E print");
        }
    }
}
