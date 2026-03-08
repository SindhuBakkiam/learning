package main.java.dsa;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] calculateSum (int[] sums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
         for (int i=0;i<sums.length;i++){
            int x = target-sums[i];
           if(map.containsKey(x)){
              res[0]= map.get(x);
              res[1]=i;
           }else{
               map.put(sums[i],i);
           }
        }

         return res;

    }

}
