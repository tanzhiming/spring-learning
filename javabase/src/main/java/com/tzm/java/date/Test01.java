package com.tzm.java.date;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;


public class Test01 {

    public static void main(String[] args) throws InterruptedException {
        Instant start = Instant.now();
        TimeUnit.SECONDS.sleep(1);
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println(timeElapsed.toMillis());
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
