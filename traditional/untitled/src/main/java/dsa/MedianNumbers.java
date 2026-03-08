package main.java.dsa;

import java.util.Arrays;

public class MedianNumbers {


    private int findMedian(int[] nums) {

       // Arrays.stream(nums).sorted().forEach(System.out::println);
        int n = nums.length;
        if(n%2==0){
           int medIndex= n/2;
           int median= (nums[medIndex]+nums[medIndex-1])/2;
           return median;
        }else{
            int medIndex=(n-1)/2;
            return nums[medIndex];
        }

    }
    public static void main(String[] args){
        MedianNumbers medianNumbers = new MedianNumbers();
       int[] X = {1, 1, 2}, Y = {3, 2, 3};
       System.out.println(medianNumbers.findMedian(X));
        System.out.println(medianNumbers.findMedian(Y));
        int[] X1 = {1, 1, 1}, Y1 = {2, 2, 2};
        System.out.println(medianNumbers.findMedian(X1));
        System.out.println(medianNumbers.findMedian(Y1));
        int[] X2 = {1, 2, 3, 1, 2, 12, 8, 4}, Y2= {5, 10, 15, 2, 4, 15, 10, 5};
        System.out.println(medianNumbers.findMedian(X2));
        System.out.println(medianNumbers.findMedian(Y2));

        int[] X3 = {1, 2, 3, 1, 2, 12, 8};
        System.out.println(medianNumbers.findMedian(X3));



    }
}
