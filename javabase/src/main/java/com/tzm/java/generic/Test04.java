package com.tzm.java.generic;

public class Test04 {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("zhangsan");
        Pair<Manager> managerPair = new Pair<>(manager, manager);
        Pair<? extends Employee> wildcardBuddies = managerPair;
        printBuddies(managerPair);
    }

    public static void printBuddies(Pair<? extends Employee> p) {
        Employee first = p.getFirst();
        Employee second = p.getSecond();
        System.out.println(first.getName() + " and " + second.getName() + " are buddies.");
    }
}
