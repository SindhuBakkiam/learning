package main.java.jdk8;

import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public non-sealed class PredicateExample extends SealedClassExample {
    public static void main(String[] args) {

        Predicate<String> stringPredicate = (String value) -> {
             if(value!=null){
                 return true;
             }
             return false;
        };
        Predicate secondPredicate=stringPredicate.and((String secVal)->{
            if(secVal.equals("abc")){
                return true;
            }
            return false;
        });

        Predicate<String> thirdPredicate=secondPredicate.or((Object thirdValue)->{
            if(thirdValue!=null && thirdValue.equals("cde")){
                return true;
            }
            return false;
        });

       Predicate<String> fourthPredicate= thirdPredicate.negate();

        System.out.println("Result1: " + stringPredicate.test("abc"));
        System.out.println("Result1: " + stringPredicate.test(""));
        System.out.println("Result1: " + stringPredicate.test(null));

        System.out.println("Result2: " + secondPredicate.test("abc"));
        System.out.println("Result2: " + secondPredicate.test(""));
        System.out.println("Result2: " + secondPredicate.test(null));

        System.out.println("Result3: " + thirdPredicate.test("abc"));
        System.out.println("Result3: " + thirdPredicate.test(""));
        System.out.println("Result3: " + thirdPredicate.test(null));
        System.out.println("Result3: " + thirdPredicate.test("cde"));

        System.out.println("Resul4: " + fourthPredicate.test("abc"));
        System.out.println("Result4: " + fourthPredicate.test(""));
        System.out.println("Result4: " + fourthPredicate.test(null));
        System.out.println("Result4: " + fourthPredicate.test("cde"));







    }
}