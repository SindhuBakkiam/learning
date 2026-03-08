package main.java.jdk8;

import java.util.*;
import java.util.concurrent.atomic.LongAdder;

public class RepetitionStrings {




    public List<String>  countRepition(String n){
       List<String> resStr = new ArrayList<>();
        if(n==null || n.isBlank()){
            System.out.println("Input is empty");
            return Collections.emptyList();
        }

        char[] nArr = n.toCharArray();
        int count=1;
        boolean updated=false;
         for(int i =0;i<nArr.length;i++){
            if(i==0){
                continue;
            }
            else if(nArr[i-1] == nArr[i]){
                    count+=1;
                    if(i==(nArr.length-1)){
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append(String.valueOf(nArr[i])).append(count);
                        resStr.add(stringBuffer.toString());
                    }
                }else{
                 StringBuffer stringBuffer = new StringBuffer();
                 stringBuffer.append(nArr[i-1]).append(count);
                 resStr.add(stringBuffer.toString());
                if(i==(nArr.length-1)){
                 /*   StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(String.valueOf(nArr[i])).append(count);
                    resStr.add(stringBuffer.toString());*/
                }
                 updated=true;
                 count=1;
                }
             }
        if(!updated) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(String.valueOf(nArr[0])).append(count);
            resStr.add(stringBuffer.toString());
        }

        return resStr;
    }

    public static void main (String[] args){
        RepetitionStrings sreps=new RepetitionStrings();

        List<String> resultMap=sreps.countRepition("aabcccccaaa");

        StringBuffer stringBuffer= new StringBuffer();
        resultMap.forEach(stringBuffer::append);

        System.out.println(stringBuffer.toString());
    }
}
