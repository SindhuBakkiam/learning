package main.java.jdk8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {

    public  static void main(String[] args){

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.toString());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.toString());


        LocalDate date = LocalDate.of(2025, 7,10);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formatted = date.format(formatter);  // "04-07-2025"
        System.out.println(formatted);
    }
}
