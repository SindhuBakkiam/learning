package main.java.jdk8;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

public non-sealed class FunctionExample extends SealedClassExample{
    public static void main(String[] args) {
        Function<String,Integer> stringFunc = String::length;


    }
}
