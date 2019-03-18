package com.tzm.java.assertion;

public class Test01 {

    public static void main(String[] args) {
        Test01 test01 = new Test01();
        test01.test(10);
    }

    public void test(int a) {
        assert a >= 0: a;
    }
}
