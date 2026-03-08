package main.java.jdk8;

import java.util.Optional;

public class OptionalExample {

    /*Optional<String> getMiddleName(String p) {
        return Optional.ofNullable(p)
                .map(String::valueOf);
    }*/
    Optional<Double> getMiddleName(Integer p) {
        return Optional.ofNullable(p)
                .map(Double::valueOf);
    }

    public static void main(String[] args){
        OptionalExample optionalExample = new OptionalExample();
        System.out.println(optionalExample.getMiddleName(123));
        System.out.println(optionalExample.getMiddleName(null));


    }
}
