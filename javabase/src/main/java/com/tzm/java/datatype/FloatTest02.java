package com.tzm.java.datatype;

public class FloatTest02 {


    public static void main(String[] args) {

        // 整数被0除会产生一个异常，而浮点数被0除将会等到无穷大或NaA结果

        double a = 10.0/0;
        double b = 0.0/0;

        System.out.printf("%f, %f", a, b);
    }
}
