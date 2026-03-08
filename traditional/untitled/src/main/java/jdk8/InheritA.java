package main.java.jdk8;

public interface InheritA {

    default void test(){
        System.out.println("Hello");
    }
}
