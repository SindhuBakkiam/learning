package main.java.jdk8;

public interface InheritB extends InheritA{

    default void hello() {
        System.out.println("Hello from B");
    }
}
