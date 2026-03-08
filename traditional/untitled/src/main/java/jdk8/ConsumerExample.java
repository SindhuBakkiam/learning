package main.java.jdk8;

import java.lang.ref.Cleaner;
import java.lang.ref.SoftReference;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> consumer = (String value)->{

            System.out.println(value);
        };
        Consumer<String> consumer1 =consumer.andThen((String value)->{
            System.out.println(value.concat("concatenated String"));
        });
        Consumer<String> consumer2 = consumer1.andThen((String value)->{
            System.out.println(value.toUpperCase());
        });
        //consumer.accept("sindhu");
        consumer2.accept("sindhu");
      //  SoftReference<Consumer<String>> consumerSoftReference  = new SoftReference<>();
       // consumerSoftReference.get().
    }

}
