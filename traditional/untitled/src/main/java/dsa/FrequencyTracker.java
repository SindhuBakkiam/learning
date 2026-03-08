package main.java.dsa;

import java.util.HashMap;
import java.util.Map;

public class FrequencyTracker {
    Map<Integer, Integer> dataMap=new HashMap<>();
    Map<Integer,Integer>  frequencyMap=new HashMap<>();
    int[] map, freq;
    public static void main(String[] args){
        FrequencyTracker frequencyTracker = new FrequencyTracker();
        frequencyTracker.hasFrequency(1);
        frequencyTracker.add(3);
        frequencyTracker.add(1);
        frequencyTracker.hasFrequency(1);
        frequencyTracker.add(3);
        frequencyTracker.hasFrequency(2);
        frequencyTracker.add(1);
        frequencyTracker.hasFrequency(2);
        frequencyTracker.deleteOne(10);
        frequencyTracker.hasFrequency(2);
        frequencyTracker.deleteOne(6);
        frequencyTracker.add(7);
        frequencyTracker.deleteOne(10);
        frequencyTracker.hasFrequency(2);
        frequencyTracker.hasFrequency(1);
        frequencyTracker.add(1);
        frequencyTracker.add(2);
        frequencyTracker.add(3);
        frequencyTracker.hasFrequency(1);
        frequencyTracker.deleteOne(3);
        frequencyTracker.hasFrequency(2);
        frequencyTracker.hasFrequency(3);


        // frequencyTracker.deleteOne(1);
    }
    public FrequencyTracker() {
        map = new int[100001];
        freq = new int[100001];
    }

    public void add(int number) {
      /*  Integer oldValue = dataMap.getOrDefault(number,0);
        Integer newValue=oldValue+1;

        Integer freqCounter = frequencyMap.getOrDefault(newValue,0);
        Integer newFreq=freqCounter+1;

        dataMap.put(number,newValue);
        frequencyMap.put(freqCounter,newFreq);*/

        freq[map[number]++]--;
        freq[map[number]]++;



    }

    public void deleteOne(int number) {
    /*    if(dataMap.isEmpty() || !dataMap.containsKey(number)){
            return;
        }
        Integer oldFreq = dataMap.get(number);
        Integer oldFreqCount = frequencyMap.get(oldFreq);


       Integer newFreq = oldFreq-1;
        Integer newFreqCount = oldFreqCount-1;
        if(newFreq==0 && newFreqCount==0){
            dataMap.remove(number);
            frequencyMap.remove(oldFreq);
        }else{
            dataMap.put(number,newFreq);
            frequencyMap.replace(newFreq,newFreqCount);
        }*/

        if (map[number] > 0) {
            freq[map[number]--]--;
            freq[map[number]]++;
        }

    }

    public boolean hasFrequency(int frequency) {
       /* if(dataMap.isEmpty()){
            return false;
        }
        return frequencyMap.getOrDefault(frequency,0)>0;*/

        return freq[frequency] > 0;
    }
}

