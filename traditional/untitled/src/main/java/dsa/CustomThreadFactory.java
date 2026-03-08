package main.java.dsa;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class CustomThreadFactory implements ThreadFactory {
    private final AtomicInteger count = new AtomicInteger(1);


    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("CustomThread-" + count.getAndIncrement());
    //    thread.setDaemon(true); // Make it a daemon thread
        thread.setPriority(Thread.NORM_PRIORITY);
        return thread;
    }
}
