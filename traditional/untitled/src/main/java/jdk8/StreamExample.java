package main.java.jdk8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] strings){

        //USE CASE 1-Convert to Map
        Employee employee = new Employee("Sindhu",1);
        Employee employee1 = new Employee("Vaishu",2);
        Employee employee2 = new Employee("Aadhi",3);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        Map<Integer,String> map = employeeList.stream().
                collect(Collectors.toMap(Employee::getId,Employee::getName));

        //USE CASE 2: COMPARATOR
      List<Employee> sortedList=  employeeList.stream().
               sorted((emp1,emp2)->emp2.getId().compareTo(emp1.getId())).toList();

      for(Employee em:sortedList){
          System.out.println(em.getId());
      }

      // USE CASE 3 : partiyion odd and even numbers
       Map<Boolean,List<Employee>> partitionMap= employeeList.stream().
               collect(Collectors.partitioningBy(emp1->emp1.getId()==1));
        for(Boolean key:partitionMap.keySet()){
             System.out.println(partitionMap.get(key).size());
             System.out.println(key);
        }
       // USE CASE 4 : Distinct
        Employee employee5 = new Employee("Aadhi",3);
        employeeList.add(employee5);
        System.out.println(employeeList.size());
        List<Employee> distinctEmployees= employeeList.stream().distinct().toList();
        System.out.println(distinctEmployees.size());

        //USE CASE 5 : IntegerStream
        IntStream intStream= IntStream.builder().add(100).add(200).add(300).build();
        intStream.forEach(System.out::println);

        //USE CASE 6 : Merge 2 unsorted arrays to sorted arrays.

        int[] a = new int[] {3,2,1};
        int[] b = new int[]{8,4,6,10};


        int[] mergedSortedArray= IntStream.concat(Arrays.stream(a),
                Arrays.stream(b)).sorted().toArray();
        for(int val : mergedSortedArray){
            System.out.println(val);
        }

        //USE CASE 7 : String Sorting
        String[] strArr = new String[] {"abc","aabbddddd","ksjdfhskdfh","yuojkj","a"};
        Arrays.stream(strArr).sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        Arrays.stream(strArr).sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

        //USE CASE 8 : Get max and min numbers

        Arrays.stream(a).sorted().limit(3).forEach(System.out::println);
        Stream.of(a).sorted(Collections.reverseOrder()).limit(3).forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        long count = numbers.stream().count();
        int sum = numbers.stream().mapToInt(Integer::intValue).peek(System.out::println).sum();
        double average = numbers.parallelStream().collect(Collectors.averagingInt(i -> i));
        IntSummaryStatistics stats = numbers.stream().mapToInt(Integer::intValue).summaryStatistics();

        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());


    }
}
