package com.tzm.java.date;

import java.time.LocalDate;

public class Test02 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1903, 6, 14);
        System.out.println(birthday);

    }
}
