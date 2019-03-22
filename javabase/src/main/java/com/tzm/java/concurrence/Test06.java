package com.tzm.java.concurrence;

import java.util.concurrent.atomic.LongAccumulator;

public class Test06 {

    public static void main(String[] args) {
        LongAccumulator adder = new LongAccumulator(Long::sum, 0);
        adder.accumulate(10);
        adder.accumulate(11);
        System.out.println(adder.get());
    }
}
