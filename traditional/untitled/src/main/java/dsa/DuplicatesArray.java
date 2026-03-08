package main.java.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicatesArray {

    public static void main(String[] args){
       int[] nums = {1,1,2};
       DuplicatesArray duplicatesArray = new DuplicatesArray();
       duplicatesArray.findDuplicates(nums);
    }

    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> dupMapCount  = new HashMap<>();
        List<Integer> dup=new ArrayList<>();

        for(int i=0;i< nums.length;i++){
            dupMapCount.put(nums[i],Math.addExact(dupMapCount.computeIfAbsent(nums[i],k->0),1));
            if(dupMapCount.get(nums[i])>1){
                dup.add(nums[i]);
            }
        }

        return dup;
    }
}
