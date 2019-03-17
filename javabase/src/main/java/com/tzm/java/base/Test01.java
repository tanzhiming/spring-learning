package com.tzm.java.base;

import java.math.BigDecimal;

public class Test01 {

    public static void main(String[] args) {
        BigDecimal a = BigDecimal.valueOf(1.1);
        BigDecimal b = BigDecimal.valueOf(0.9);
        System.out.println(a.add(b));
    }
}
