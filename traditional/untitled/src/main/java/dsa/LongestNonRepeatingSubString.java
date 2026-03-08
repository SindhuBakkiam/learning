package main.java.dsa;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingSubString {

    public static void main(String[] args){
       // String s="abcabcbb";
        String s="pwwkew";
        char x=s.charAt(0);
        int j=0;
        int maxLength=0;
        Set<Character> result = new HashSet<>();
        for(int i=0;i<s.length();i++) {
            char temp = s.charAt(i);
            while(result.contains(temp)) {
                result.remove(s.charAt(j));
                j++;
            }
                maxLength=Math.max(maxLength,(i-j)+1);
                result.add(temp);

        }

        System.out.println(maxLength);
    }

    public void updateSet(Set<Character> result , String s,int j,int maxLength,int i, char temp){
            result.remove(s.charAt(j));
            j++;
            maxLength=Math.max(maxLength,(i-j)+1);
            if(!result.add(temp)){
                updateSet(result,s,j,maxLength,i,temp);
            }


    }
}
