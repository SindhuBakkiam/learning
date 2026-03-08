package main.java.dsa;

import java.util.concurrent.ThreadFactory;

public class ThreadFactoryExample {

    public static void main(String[] args) {
       ThreadFactory threadFactory = new CustomThreadFactory();
        Thread thread = threadFactory.newThread(() -> {
            System.out.println("Custom thread started" + Thread.currentThread().getName());});
        thread.start();
    }
}
