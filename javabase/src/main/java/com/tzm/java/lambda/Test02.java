package com.tzm.java.lambda;

import java.util.Arrays;

public class Test02 {

    public static void main(String[] args) {

        /*
        lambda
        方法引用:
        1. object::instanceMethod
        2. Class::staticMethod
        3. Class::instanceMethod
         在前2种情况中，方法引用等价于提供方法的参数的lambda表达式。如： System.out::println 等价于 x->System.out.println(x)。
         Math::pow等价于(x, y) -> Math.pow(x, y)。
         第3中情况，第一个参数会成为方法的目标。例： String::compareToIgnoreCase 等同于 (x, y) -> x.compareToIgnoreCase(y)。
         */



        String[] names = {"zhangsan", "lisi", "wangwu", "zhaoliu"};

        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));



    }
}
