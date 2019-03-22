package com.tzm.java.generic;

public class Test03 {

    public static void main(String[] args) {
//        Pair<String> p = Pair.makePair(String::new);
//        Pair<Manager> managerPair = new Pair<>();
//        Pair<Employee> employeePair = managerPair;

        Manager[] managers = {new Manager(), new Manager()};
        Employee[] employees = new Employee[10];
        employees[0] = managers[0];
    }
}
