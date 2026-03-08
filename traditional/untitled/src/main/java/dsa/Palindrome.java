package main.java.dsa;

import java.util.stream.IntStream;

public class Palindrome {

    public boolean isPalindrome(int x){
        Integer reversed = 0;
       int  tempNum = Math.abs(x);
       while(tempNum!=0){
           int digit = tempNum%10;
           reversed=reversed*10 + digit;
           tempNum=tempNum/10;
       }
        return reversed==x;
    }

    public static void main(String[] args){

         Palindrome palindrome = new Palindrome();
        System.out.println("is 121 a Palindrome? " +  palindrome.isPalindrome(121));
        System.out.println("is -121 a Palindrome? " +  palindrome.isPalindrome(-121));
        System.out.println("is 645646498 a Palindrome? " +  palindrome.isPalindrome(645646498));


    }
}
