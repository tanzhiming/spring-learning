package com.tzm.java.generic;

import java.util.ArrayList;
import java.util.Collection;

public class Test02 {

    public static void main(String[] args) {
        Collection<Pair<String>> table = new ArrayList<>();
        Pair<String> pair1 = new Pair<>();
        Pair<String> pair2 = new Pair<>();
        add(table, pair1, pair2);
    }

    @SafeVarargs
    public static <T> void add(Collection<T> coll, T... ts) {
        for (T t  : ts) {
            coll.add(t);
        }
    }
}


