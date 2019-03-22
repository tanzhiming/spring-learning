package com.tzm.java.generic;

import java.util.function.Supplier;

public class Test01 {

    public static void main(String[] args) {
        // 不能创建参数化类型的数字
        // Pair<String>[] table = new Pair<String>[10];


        Pair<String>[] table = (Pair<String>[]) new Pair<?>[10];

        Pair<Manager> managerPair = new Pair<>();
        Pair<? extends Employee> wildcardPair = managerPair;

        Pair<Employee> employeePair = new Pair<>();

//        wildcardPair.setFirst(managerPair);
//        wildcardPair.setFirst(employeePair);

    }
}

class Pair<T> {
    private T first;
    private T second;

    public Pair() {}

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public static <T> Pair<T> makePair(Supplier<T> constr) {
        return new Pair<>(constr.get(), constr.get());
    }
}

class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Manager extends Employee {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}