package main.java.jdk8;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrencyTotals {

    public Map<String, LongAdder> totalsMap = new ConcurrentHashMap<>();


    public void addTransaction(Transaction transaction){
        if(transaction==null || transaction.getUser()==null || transaction.getUser().isBlank()
         || transaction.getAmount()==0)
            return;

        totalsMap.computeIfAbsent(transaction.getUser(),F-> new LongAdder()).add(transaction.getAmount());
    }

    public  int getTotalsForUser(String user){
        return totalsMap.get(user).intValue();
    }
}
