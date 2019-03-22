package com.tzm.java.concurrence;

public class Test07 {

    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>(10);

        Thread product = new Thread(()-> {
            int i = 0;
            while (true) {
                myQueue.add(i++);
                System.out.println("product thread: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consume = new Thread(()->{
            while (true) {
                int a = myQueue.take();
                System.out.println("consume thread: " + a);
            }
        });
        product.start();
        consume.start();
    }
}

class MyQueue<T> {

    private Node<T> head;
    private Node<T> tail;
    private int capacity;
    private int size;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        this.size = 0;
    }

    class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;
    }

    public synchronized void add(T t) {
        while (size >= capacity) {
            try {
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (tail != null) {
            Node<T> n = new Node<>();
            n.data = t;
            n.prev = tail;
            tail.next = n;
            tail = n;
        } else {
            Node<T> n = new Node<>();
            n.data = t;
            head = n;
            tail = n;
        }
        size++;
        notifyAll();
    }

    public synchronized T take() {
        while (size <= 0) {
            try {
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        T t = tail.data;
        if (tail.prev == null) {
            tail = head = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        notifyAll();
        return t;
    }

}
