package com.tzm.java.generic;

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
}

class Employee {

}

class Manager extends Employee {

}