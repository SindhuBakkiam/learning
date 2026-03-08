package main.java.dsa;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMedian {
    public static void main(String[] args){
        SlidingWindow slidingWindow = new SlidingWindow();
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] result = slidingWindow.maxSlidingWindow2(nums,k);
        Arrays.stream(result).forEach(System.out::println);

    }
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
