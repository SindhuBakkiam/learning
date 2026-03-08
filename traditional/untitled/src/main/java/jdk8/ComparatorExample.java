package main.java.jdk8;

import java.util.Comparator;

public class ComparatorExample {

    public static void main(String[] args){

        Comparator<String> comparator = Comparator.reverseOrder();
        System.out.println(comparator.compare("abcd","abc"));
    }
}
