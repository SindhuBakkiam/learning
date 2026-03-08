package main.java.dsa;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableCallableExample {

    public static void main(String[] args) {
        Runnable runnable = ()->{
            System.out.println("Runnable running on " + Thread.currentThread().getName());
        };
       ExecutorService executorService = Executors.newSingleThreadExecutor();
       executorService.execute(runnable);

        Callable<String> callable = ()->{
           System.out.println("Callable running on " + Thread.currentThread().getName());
            return "Callable ran on " + Thread.currentThread().getName();
        };
        Future<String> future = executorService.submit(callable);
        try {
            String  result= future.get();
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
