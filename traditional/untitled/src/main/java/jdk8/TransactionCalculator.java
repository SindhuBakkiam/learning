package main.java.jdk8;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class TransactionCalculator {

   public static void main(String[] args){

       ConcurrencyTotals concurrencyTotals = new ConcurrencyTotals();

        List<Transaction> transactions = List.of(
                new Transaction("u1", 100),
                new Transaction("u2", 200),
                new Transaction("u1", -50),
                new Transaction("", 300),
                new Transaction("u3", 0),
                new Transaction("u2", 100)
        );

       transactions.forEach(concurrencyTotals::addTransaction);
       System.out.println("u2 ="+ concurrencyTotals.getTotalsForUser("u2"));


        Runnable task1= () -> {
            ConcurrencyTotals   concurrencyTotals1 = new ConcurrencyTotals();
            List<Transaction> transactions1 = List.of(
                    new Transaction("u1", 100),
                    new Transaction("u2", 200),
                    new Transaction("", -50),
                    new Transaction("u3", 300),
                    new Transaction("u3", 0),
                    new Transaction("u2", 100)
            );
            transactions1.forEach(concurrencyTotals::addTransaction);

            System.out.println("u1 ="+ concurrencyTotals.getTotalsForUser("u1"));


        };

        Runnable task2= () -> {
            ConcurrencyTotals   concurrencyTotals2= new ConcurrencyTotals();
            List<Transaction> transactions2 = List.of(
                    new Transaction("u2", 200),
                    new Transaction("", -50),
                    new Transaction("u3", 300),
                    new Transaction("u3", 0),
                    new Transaction("u2", 100)
            );
            transactions2.forEach(concurrencyTotals::addTransaction);
            System.out.println("u3 ="+ concurrencyTotals.getTotalsForUser("u3"));


        };

            Thread t1 = new Thread(task1,"task1");
            Thread t2 = new Thread(task2,"task2");
            t1.start();
            t2.start();

    }



    public void printResult(Map<String,Integer> resMap){
        resMap.forEach((k,v)->{
            System.out.println(k+"="+v);
        });
    }

    public void addTransaction(Transaction transaction){

    }
}
