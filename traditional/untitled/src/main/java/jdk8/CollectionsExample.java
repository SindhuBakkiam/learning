package main.java.jdk8;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CollectionsExample {

    public static void main(String[] args){
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>(16,0.75f,true);
       map.putFirst(1,"A");
       map.putLast(26,"Z");
        map.put(5,"E");
        map.computeIfAbsent(10,(v)->v+"BE");
        map.computeIfPresent(1,(k,v)->"J");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

       /**system.out.println(26 + " : " + map.get(26));**/
        System.out.println(1 + " : " + map.get(1));
        System.out.println(map.pollFirstEntry().getKey());
        System.out.println(map.pollLastEntry().getKey());

        // map.keySet().forEach(key->System.out.println(key + " : " + map.get(key)));

        LinkedList<String> strings = new LinkedList<>();
        strings.addFirst("ABBC");
        strings.addLast("CDE");
        strings.add("FHG");
        System.out.println(strings.peekFirst());
        System.out.println(strings.peekLast());
     strings.stream().collect(Collectors.collectingAndThen(Collectors.toList(),Collections::unmodifiableList));

        strings.stream().forEach(System.out::println);
        ArrayList<Integer> integers = new ArrayList<>();
  //      integers.add(5,39);
        HashSet<Integer> integers1 = new HashSet<>();
        integers1.add(5);
        integers1.stream().count();
        integers1.add(10);
        integers1.add(5);
        Vector<Integer> integers2 = new Vector<>();
        integers2.addAll(integers1);
        Integer[] array1= {};
        array1[0]=1;
        LinkedHashSet<Integer> integers3 = new LinkedHashSet<>();
        integers3.add(50);
        TreeSet<String> strings1 = new TreeSet<>();
        strings1.add("ABC");
        CopyOnWriteArrayList<String> strings2 = new CopyOnWriteArrayList<>();
        strings2.add("ABC");
        strings2.add("CDE");

        strings2.iterator();

     Supplier<List<String>> listSupplier =()-> new ArrayList<>();
     listSupplier.get();



    }
}
