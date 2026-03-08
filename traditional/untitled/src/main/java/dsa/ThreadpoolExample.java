package main.java.dsa;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadpoolExample {

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.schedule(
                    (() -> System.out.println("Task " + taskId + " is running on thread: " +
                        Thread.currentThread().getName()+ "delay " + System.currentTimeMillis()) ),
                    3, TimeUnit.MINUTES);

        }
        executor.shutdown(); // Shutdown after task completion
    }
}
