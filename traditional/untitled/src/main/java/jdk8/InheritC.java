package main.java.jdk8;

public interface InheritC extends InheritA{

    default void hello() {
        System.out.println("Hello from C");
    }
}
