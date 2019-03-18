package com.tzm.java.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Test01 {


    public static void main(String[] args) {
        String[] names = {"zhangsan", "lisi", "wangwu", "zhaoliu"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        //Arrays.sort(names, (x, y)->x.length() - y.length());
        Arrays.sort(names, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(names));
    }
}
