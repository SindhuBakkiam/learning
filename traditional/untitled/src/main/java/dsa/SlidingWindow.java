package main.java.dsa;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindow {


    public static void main(String[] args){
        SlidingWindow slidingWindow = new SlidingWindow();
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
       /*  int[] result = slidingWindow.maxSlidingWindow(nums,k);
        Arrays.stream(result).forEach(System.out::println);*/

    }

   /* public int[] maxSlidingWindow(int[] nums,int k) {
     int[] medianArr = new int[(nums.length-k)+1];
     int x=0;
        int med=k/2;
        int oddMed=med%2==0? med-1:-1;
        Map<Integer,Integer> sortedMap = new TreeMap<>();
        Map<Integer,Integer> sortedMap2 = new TreeMap<>();
        int[] integers = new int[k];

         sortedMap.put(nums[0],0);
        integers[0]=nums[0]
        for(int i=1;i<k;i++){
            if(nums[i]<nums[i-1]){
                integers.add(i-1,nums[i]);
                integers.add(i,nums[i-1]);

            }else{
                integers.add(i,nums[i]);
            }
        }
        int medVal = integers.get(med);
        int oddMedVal = oddMed>-1?integers.get(oddMed):-1;
        if(oddMedVal>-1){
            medVal= (medVal+oddMedVal)/2;
        }
        medianArr[x]=medVal;
        for(int i=k;i<nums.length;i++){
            sortedMap.remove(nums[i-k]);
            sortedMap.put(nums[i],i);
            medVal = sortedMap.get(med);
             oddMedVal = oddMed>-1?sortedMap.get(oddMed):-1;
            if(oddMedVal>-1){
                medVal= (medVal+oddMedVal)/2;
            }
            ++x;
            medianArr[x]=medVal;
        }
        return medianArr;
    }*/

    public int[] maxSlidingWindow2(int[] nums,int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] res = new int[nums.length-k + 1];
        int x=0;
        for(int i=0;i<nums.length;i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k){
                dq.removeFirst();
            }

            // Remove smaller elements from back
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.removeLast();
            }

            dq.addLast(i);  // Add current index

            if (i >= k - 1) {
                res[x] = nums[dq.peekFirst()];
                x++;// Maximum of current window
            }

          /*  int[] r = new int[left];
            for (int i = 0; i < r.length; i++) {
                r[i] = res[i];
            }*/
        }
        return res;

    }
}
