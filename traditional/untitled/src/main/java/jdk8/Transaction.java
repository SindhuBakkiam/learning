package main.java.jdk8;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Transaction {


    private AtomicReference<String> user = new AtomicReference<>();
    private AtomicInteger amount = new AtomicInteger();

    public Transaction(String user, int amount){
        this.user.set(user);
        this.amount.set(amount);
    }
    public String getUser() {
        return user.get();
    }

    public int getAmount() {
        return amount.get();
    }




}
