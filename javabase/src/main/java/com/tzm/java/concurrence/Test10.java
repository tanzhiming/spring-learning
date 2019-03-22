package com.tzm.java.concurrence;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class Test10 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Integer> joinTask = forkJoinPool.submit(new CountTask(1, 100));
        System.out.println(joinTask.get());
    }
}


class CountTask extends RecursiveTask<Integer> {

    private static final int threshold = 2;
    private int start;
    private int end;

    public CountTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        boolean canCompute = end - start <= threshold;
        int sum = 0;
        if (canCompute) {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        } else {
            int middle = (start + end) / 2;
            CountTask left = new CountTask(start, middle);
            CountTask right = new CountTask(middle + 1, end);
            left.fork();
            right.fork();
            int leftValue = left.join();
            int rightValue = right.join();
            sum = leftValue + rightValue;
        }
        return sum;
    }
}
